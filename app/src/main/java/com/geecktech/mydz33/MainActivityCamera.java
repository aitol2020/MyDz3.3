package com.geecktech.mydz33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivityCamera extends AppCompatActivity {
    Button fotoclikc;
    Button videoclikc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_camera);
        fotoclikc = findViewById(R.id.fotoclikc);
        videoclikc = findViewById(R.id.videoclikc);


        fotoclikc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCamera = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(intentCamera);
            }
        });

        videoclikc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVideoCamera = new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
                startActivity(intentVideoCamera);
            }
        });
    }
}