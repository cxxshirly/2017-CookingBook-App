package com.example.xu.chenfinalproject.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xu.chenfinalproject.R;
import com.example.xu.chenfinalproject.util.UtilLog;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Picture2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Picture2Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public Picture2Fragment() {
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
    public static Picture2Fragment newInstance(String param1, String param2) {
        Picture2Fragment fragment = new Picture2Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
//        Log.d("Fragment","onCreate");
        UtilLog.d("Fragment","Pic2:onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_picture2, container, false);
    }
    @Override
    public void onStart() {
        super.onStart();
        UtilLog.d("Fragement","Pic2:onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        UtilLog.d("Fragement","Pic2:onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        UtilLog.d("Fragement","Pic2:onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        UtilLog.d("Fragement","Pic2:onStop");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        UtilLog.d("Fragement","Pic2:onDestroy");

    }
}