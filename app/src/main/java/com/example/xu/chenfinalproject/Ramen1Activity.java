package com.example.xu.chenfinalproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.xu.chenfinalproject.Adapter.ViewFragmentStateAdapter;
import com.example.xu.chenfinalproject.Fragment.Picture1Fragment;
import com.example.xu.chenfinalproject.Fragment.Picture2Fragment;
import com.example.xu.chenfinalproject.Fragment.Picture3Fragment;
import com.example.xu.chenfinalproject.Fragment.Ramen1Fragment;
import com.example.xu.chenfinalproject.Fragment.Ramen2Fragment;
import com.example.xu.chenfinalproject.Fragment.Ramen3Fragment;
import com.example.xu.chenfinalproject.Fragment.Ramen4Fragment;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Ramen1Activity extends AppCompatActivity {

    private ArrayList<Pair<String, Fragment>> list = new ArrayList<Pair<String,Fragment>>();

    @BindView(R.id.activity_ramen_tablayout)
    TabLayout tabLayout;

    @BindView(R.id.activity_ramen_viewpager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramen);
        ButterKnife.bind(this);
        list.add(new Pair<String, Fragment>("Intro", new Ramen1Fragment()));
        list.add(new Pair<String, Fragment>("INGREDIENTS", new Ramen2Fragment()));
        list.add(new Pair<String, Fragment>("STEPs", new Ramen3Fragment()));
        list.add(new Pair<String, Fragment>("Question", new Ramen4Fragment()));
        ViewFragmentStateAdapter adapter = new ViewFragmentStateAdapter(this.getSupportFragmentManager(),list);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
