package com.geecktech.mydz33;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public  class MainActivitySearch extends AppCompatActivity {
    Button searchgoogle;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search);
        searchgoogle = findViewById(R.id.searchgoogle);
        editText = findViewById(R.id.search);
        searchgoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoogle = new Intent(Intent.ACTION_WEB_SEARCH);
                intentGoogle.putExtra(SearchManager.QUERY,editText.getText().toString().trim());
                startActivity(intentGoogle);

            }
        });
    }

}