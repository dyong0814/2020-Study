package com.example.kakaotalk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kakaotalk.R;

public class LoginActivity extends AppCompatActivity {

    EditText et_email;
    EditText et_password;
    Button bt_login;
    Button bt_join;

    final static String Email = "abc@naver.com";
    final static String Password = "dms2113";

@Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        bt_login = findViewById(R.id.bt_login);
        bt_join = findViewById(R.id.bt_join);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = et_email.getText().toString();
                String password = et_password.getText().toString();

                if(email.equals(Email) && password.equals(Password)) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "아이디나 비밀번호가 잘못됬습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}