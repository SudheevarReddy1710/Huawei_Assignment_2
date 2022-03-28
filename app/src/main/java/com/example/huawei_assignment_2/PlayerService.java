package com.example.huawei_assignment_2;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
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
        mp = MediaPlayer.create(getApplicationContext(), R.raw.perfect);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //starting the song
        mp.start();
        mp.setLooping(true);
        Toast.makeText(getApplicationContext(),"Service Started",Toast.LENGTH_LONG).show();
        //looping the song
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        //stopping the song
        super.onDestroy();
        mp.stop();
        Toast.makeText(getApplicationContext(),"Service Stopped",Toast.LENGTH_LONG).show();
    }
}
