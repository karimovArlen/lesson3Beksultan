package com.example.lesson3_beksultan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextInputEditText EMAIL,MASSAGE,THEME;
    Button SENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EMAIL = findViewById(R.id.f1);
        MASSAGE = findViewById(R.id.f3);
        THEME = findViewById(R.id.f2);
        SENT = findViewById(R.id.bt_sent);
        SENT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + EMAIL.getText().toString()));
                intent.putExtra(Intent.EXTRA_SUBJECT,THEME.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,MASSAGE.getText().toString());
                startActivity(intent);

            }

        });
    }
}