package com.example.huawei_assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton playB,stopB;
    MediaPlayer player1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playB = (ImageButton) findViewById(R.id.play_button);
        stopB = (ImageButton) findViewById(R.id.stop_button);
        playB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"PlayButtonClicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,PlayerService.class);
                //start service
                startService(intent);

            }
        });
        stopB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"StopButtonClicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),PlayerService.class);
                //end service
                stopService(intent);
            }
        });



    }
}