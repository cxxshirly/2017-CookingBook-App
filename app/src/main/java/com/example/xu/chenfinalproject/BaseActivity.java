package com.example.xu.chenfinalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
//make sure all the import class is from android package
/**
 * Created by xu on 6/14/17.
 */

public class BaseActivity extends AppCompatActivity {

    public void showToast (String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }

    //need to extend baseActivity first
    //you can copy and apply this base activity to any other android package

    //common method for short toast
    public void shortToast(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
    //common method for long toast
    public void longToast(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }

    //common method for starting a new activity
    public void goToActivity (Class c){
        Intent intent = new Intent(this,c);
        startActivity(intent);
    }
}
