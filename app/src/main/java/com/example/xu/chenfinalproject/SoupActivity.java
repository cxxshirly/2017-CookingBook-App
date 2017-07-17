package com.example.xu.chenfinalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SoupActivity extends BaseActivity {

    @OnClick(R.id.SoupActivity_imageview1)
    public void imageView1(){
        goToActivity(Ramen1Activity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup);
        ButterKnife.bind(this);
    }
}
