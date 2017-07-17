package com.example.xu.chenfinalproject;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.example.xu.chenfinalproject.controller.AudioController;
import com.example.xu.chenfinalproject.util.UtilLog;

import java.io.IOException;
import java.io.InterruptedIOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class MainActivity  extends BaseActivity implements View.OnTouchListener {

    //for animation
    private GestureDetector gestureDetector;
    private int location;
    private int sumX;
    private int sumY;
    private int count = 0;

    public void trans() {

        ObjectAnimator animator = ObjectAnimator.ofFloat(plate, "translationY", 600, 15);
        animator.setDuration(3000);
        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                 goToActivity(MenuActivity.class);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        animator.start();

    }



    @BindView(R.id.MainActivity_imageview)
    TextView imageView;

    @BindView(R.id.MainActivity_plate)
    TextView plate;


    //click to the menu activity
    @OnClick(R.id.MainActivity_welcome)
    public void clickA(View v){
        goToActivity(MenuActivity.class);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        gestureDetector = new GestureDetector(this, new MainActivity.simpleGestureListener());
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        imageView.setLongClickable(true);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    private class simpleGestureListener extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapUp");
            return super.onSingleTapUp(e);
        }


        @Override
        public void onLongPress(MotionEvent e) {
            UtilLog.d("Gesture","onLongPress");
            super.onLongPress(e);
        }



        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            UtilLog.d("Gesture","onScroll");
            UtilLog.d("Gesture","distanceX"+distanceX);
            UtilLog.d("Gesture","distanceY"+distanceY);
            sumX += distanceX;
            sumY += distanceY;

            if(sumY > 0 && count == 0){
                if (Math.abs(sumY)>200) {
//                    shortToast("You scroll from botton to top");
                    plate.setVisibility(View.VISIBLE);
                    trans();
                    count ++;
                }
            }


            return super.onScroll(e1, e2, distanceX, distanceY);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            UtilLog.d("Gesture","onFling");


            return super.onFling(e1, e2, velocityX, velocityY);
        }

        @Override
        public void onShowPress(MotionEvent e) {
            UtilLog.d("Gesture","onShowPress");
            super.onShowPress(e);
        }

        @Override
        public boolean onDown(MotionEvent e) {
            UtilLog.d("Gesture","onDown");
            return super.onDown(e);
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            UtilLog.d("Gesture","onDoubleTap");
            return super.onDoubleTap(e);
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent e) {
            UtilLog.d("Gesture","onDoubleTapEvent");
            return super.onDoubleTapEvent(e);
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapConfirmed");
            return super.onSingleTapConfirmed(e);
        }

    }

}





