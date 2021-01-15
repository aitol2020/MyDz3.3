package com.geecktech.mydz33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityCalll extends AppCompatActivity {
    Button call;
    EditText editText;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calll);
        call  = findViewById(R.id.call);
        back = findViewById(R.id.back);
        editText = findViewById(R.id.callid);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentContacts = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+996)"+editText.getText().toString().trim()));
               startActivity(intentContacts);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityCalll.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}