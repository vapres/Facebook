package com.route.facebook;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText passwordEditText = findViewById(R.id.edt_password);

        if (Locale.getDefault().getLanguage().equals("ar")) {
            passwordEditText.setGravity(Gravity.END);
        } else {
            passwordEditText.setGravity(Gravity.START);
        }

    }
}
