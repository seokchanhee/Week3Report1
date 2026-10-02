package com.example.report1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextId = findViewById(R.id.editTextId);
        EditText editTextPw = findViewById(R.id.editTextPw);
        Button buttonLogin = findViewById(R.id.buttonLogin);
        TextView textViewResult = findViewById(R.id.textViewResult);

        editTextId.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    Toast.makeText(getBaseContext(), "데이터 입력 해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = editTextId.getText().toString();
                String pw = editTextPw.getText().toString();

                String message = String.format("아이디 : %s 비밀번호 : %s", id, pw);

                textViewResult.setText(message);
                textViewResult.setVisibility(View.VISIBLE);
            }
        });
    }
}