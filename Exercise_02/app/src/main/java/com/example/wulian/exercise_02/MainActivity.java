package com.example.wulian.exercise_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        final EditText editTextAccount = (EditText) findViewById(R.id.editTextAccount);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassWord);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextAccount.getText().toString();
                String passwd = editTextPassword.getText().toString();
                Toast.makeText(MainActivity.this, "姓名："+name+"密码："+passwd, Toast.LENGTH_LONG).show();
            }
        });
    }
}
