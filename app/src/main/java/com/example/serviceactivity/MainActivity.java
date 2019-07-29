package com.example.serviceactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(MainActivity.this,MusicService.class);
    }

    public void playMusicBtn(View view){
        startService(intent);
    }
    public void stopMusicBtn(View view){
        stopService(intent);
    }
}
