package com.example.xu.chenfinalproject.controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import com.example.xu.chenfinalproject.util.UtilLog;
import com.example.xu.chenfinalproject.service.MyService;

/**
 * Created by Xu on 7/14/2017.
 */

public class AudioController {

    public final static int AudioPlaying = 111;
    public final static int AudioLoading= 222;
    public final static int AudioPaused= 333;

    public static int STATUS = AudioPaused;
    private static Context context;
    private static AudioReceiver audioReceiver;
    private AudioListener listener;

    public AudioController(Context context, AudioListener listener) {
        this.context = context;
        this.listener = listener;
    }

    public void play(String url) {
        Intent intent = new Intent(context, MyService.class);
        intent.setAction("AUDIO");
        intent.putExtra("CMD",MyService.PLAY);
        intent.putExtra("URL",url);
        context.startService(intent);
        initReceiver();
    }

    private void initReceiver() {
        audioReceiver = new AudioReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(MyService.AUDIO);
        context.registerReceiver(audioReceiver,filter);

    }

    public void pause() {
        Intent intent = new Intent(context, MyService.class);
        intent.setAction("AUDIO");
        intent.putExtra("CMD",MyService.PAUSE);
        context.startService(intent);
        initReceiver();
    }


    public interface AudioListener{
        public void onPlaying();
        public void onLoading();
        public void onPaused();

    }


    public class AudioReceiver extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if(action.equals(MyService.AUDIO)){
                int msg = intent.getIntExtra("MSG",0);
                switch (msg){
                    case MyService.PLAYING:
                        STATUS = AudioPlaying;
                        listener.onPlaying();
                        UtilLog.d("AUDIO","Playing");
                        break;

                    case MyService.LOADING:
                        STATUS = AudioLoading;
                        listener.onLoading();
                        UtilLog.d("AUDIO","Loading");
                        break;

                    case MyService.PAUSED:
                        STATUS = AudioPaused;
                        listener.onPaused();
                        UtilLog.d("AUDIO","Paused");
                        break;
                }
            }
        }
    }
}
