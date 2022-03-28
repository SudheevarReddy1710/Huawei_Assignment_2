package com.example.huawei_assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton playB,stopB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playB = findViewById(R.id.play_button);
        stopB = findViewById(R.id.stop_button);
        playB.setOnClickListener(this);/*new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"PlayButtonClicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,PlayerService.class);
                //start service
                startService(intent);

            }
        });*/
        stopB.setOnClickListener(this);/*new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"StopButtonClicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,PlayerService.class);
                //end service
                stopService(intent);
            }
        });*/



    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,PlayerService.class);
        if(view == playB)
        {
            startService(intent);
        }
        else if(view ==  stopB)
        {
            stopService(intent);
        }

    }
}