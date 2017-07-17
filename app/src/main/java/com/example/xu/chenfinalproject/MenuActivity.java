package com.example.xu.chenfinalproject;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.StringDef;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.xu.chenfinalproject.Adapter.BaseViewPagerAdapter;
import com.example.xu.chenfinalproject.Fragment.Picture1Fragment;
import com.example.xu.chenfinalproject.Fragment.Picture2Fragment;
import com.example.xu.chenfinalproject.Fragment.Picture3Fragment;
import com.example.xu.chenfinalproject.controller.AudioController;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends BaseActivity {

    private AudioController audioController;
    private String audioURL = "http://other.web.rh01.sycdn.kuwo.cn/resource/n3/99/9/549575254.mp3";

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @OnClick(R.id.MenuActivity_buttonA)
    public void buttonA(){
        goToActivity(AppertzerActivity.class);
    }


    @OnClick(R.id.MenuActivity_buttonB)
    public void buttonB(){
        goToActivity(EntreeActivity.class);
    }

    @OnClick(R.id.MenuActivity_buttonC)
    public void buttonC(){
        goToActivity(SoupActivity.class);
    }

    @OnClick(R.id.MenuActivity_buttonD)
    public void buttonD(){
        goToActivity(DessertActivity.class);
    }


    @OnClick(R.id.MenuActivity_imageview1)
    public void imageView1(){
        goToActivity(Ramen1Activity.class);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle","onCreate");
        //switch pictures on the top of the menu page
        viewPager =(ViewPager)findViewById(R.id.MenuActivity_viewpager);
        list.add(new Picture1Fragment());
        list.add(new Picture2Fragment());
        list.add(new Picture3Fragment());
        BaseViewPagerAdapter pagerAdapter = new BaseViewPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(1);

        startMyService();

    }

    public MenuActivity() {
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart");

    }

    public void startMyService(){
        audioController = new AudioController(this, new AudioController.AudioListener() {
            @Override
            public void onPlaying() {

            }

            @Override
            public void onLoading() {
            }

            @Override
            public void onPaused() {
            }
        });

        audioController.play(audioURL);

    }

    public void stopService(){

    }
}