package com.example.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ProgressBar;



public class LoginActivity extends AppCompatActivity {
    private EditText mUsername;
    private EditText mPassword;
    private Button loginButton;
    private ProgressBar loadingLogin;
    boolean isProgressVisiable = false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void login(){
        mUsername = findViewById(R.id.username);
        mPassword = findViewById(R.id.password);
        loginButton = findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //lay du lieu nguoi dung nhap vao EditText
                String username = mUsername.getText().toString().trim();
                String password = mPassword.getText().toString().trim();
                //kiem tra xem nguoi dung dang nhap du lieu chua?
                if(TextUtils.isEmpty(username )){
                    mUsername.setError("Username can not be empty");
                    return;

                }
                if(isProgressVisiable ){
                    loginButton.setText("Progresing...");
                    loadingLogin.setVisibility(View.GONE);
                }
                if(username.equals("quyet") && password.equals("123456")){
                    isProgressVisiable = true;
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                } else {
                    isProgressVisiable= false;
                    loadingLogin.setVisibility(View.VISIBLE);
                    mUsername.setError("Username can not be wrong");
                    mPassword.setError("password can not be wrong");

                }



            }
        });


    }
}
