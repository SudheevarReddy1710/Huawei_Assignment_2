package com.example.huawei_assignment_2;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class PlayerService extends Service {
    MediaPlayer mp;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    @Override
    public void onCreate() {

        super.onCreate();
        mp = MediaPlayer.create(getApplicationContext(),R.raw.perfect);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //starting the song
        mp.start();
        Toast.makeText(getApplicationContext(),"Service Started",Toast.LENGTH_SHORT).show();
        //looping the song
        mp.setLooping(true);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        //stopping the song
        Toast.makeText(getApplicationContext(),"Service Stopped",Toast.LENGTH_SHORT).show();
        mp.stop();
        super.onDestroy();
    }
}
