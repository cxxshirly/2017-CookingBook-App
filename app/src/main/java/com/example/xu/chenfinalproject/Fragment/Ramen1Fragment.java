package com.example.xu.chenfinalproject.Fragment;


import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.xu.chenfinalproject.R;
import com.example.xu.chenfinalproject.util.UtilLog;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Ramen1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Ramen1Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public Ramen1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Ramen1Fragment newInstance(String param1, String param2) {
        Ramen1Fragment fragment = new Ramen1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);

        return fragment;
    }

    public void color(){
        ObjectAnimator animator = ObjectAnimator.ofInt(R.id.fragment_ramen1_swipe,"BackgroundColor",0xffff00ff,0xffffff00,0xffff00ff);
        animator.setDuration(8000);
        animator.setEvaluator(new ArgbEvaluator());
        animator.start();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        UtilLog.d("Fragment","Red:onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ramen1, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        color();
        UtilLog.d("Fragement","Pic2:onStart");

    }




    public class ArgbEvaluator implements TypeEvaluator {
        public Object evaluate (float fraction ,Object startValue, Object endValue){
            int startInt = (Integer) startValue;
            int startA = (startInt >> 24);
            int startR = (startInt >> 16)&0xff;
            int startG = (startInt >> 8)&0xff;
            int startB = startInt &0xff;

            int endInt = (Integer) endValue;
            int endA = (endInt >> 24);
            int endR = (endInt >> 16) & 0xff;
            int endG = (endInt >> 8) & 0xff;
            int endB = endInt &0xff;

            return (int)((startA +(int)(fraction * (endA - startA)))<<24) |
                    (int)((startR +(int)(fraction * (endR - startR)))<<16) |
                    (int)((startG +(int)(fraction * (endG - startG)))<<8) |
                    (int)((startB +(int)(fraction * (endB - startB))));

        }

    }
}