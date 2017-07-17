package com.example.xu.chenfinalproject.util;

import android.util.Log;

/**
 * Created by xu on 6/19/17.
 */

public class UtilLog {

    private static boolean isLog = false;

    public static void setIsLog(boolean b){
        isLog = b;
    }

    public static void d(String tag, String msg){
        if(isLog) {
            Log.d(tag, msg);

        }
    }
    public static void v(String tag, String msg){
        if(isLog) {
            Log.v(tag, msg);

        }
    }
    public static void e(String tag, String msg){
        if(isLog) {
            Log.e(tag, msg);

        }
    }
    public static void i(String tag, String msg){
        if(isLog) {
            Log.i(tag, msg);

        }
    }
}

