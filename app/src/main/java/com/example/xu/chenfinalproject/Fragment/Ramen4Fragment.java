package com.example.xu.chenfinalproject.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.xu.chenfinalproject.Adapter.AdvanceListViewAdapter;
import com.example.xu.chenfinalproject.R;
import com.example.xu.chenfinalproject.util.UtilLog;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Ramen4Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Ramen4Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    //list view
    private ArrayList<String> contentList = new ArrayList<String>();
    private final Context context;
    private ListView listView;

    private String mParam1;
    private String mParam2;


    public Ramen4Fragment() {
        // Required empty public constructor
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("How to add move flavor to my ramen?");
        contentList.add("\n" +
                "Add extra flavor with sauces and condiments. If the sauce or condiment is very salty, it might be a good idea to use less of the seasoning in the packet.");
        contentList.add("How to add move flavor to my ramen?");
        contentList.add("Add extra flavor with spices, oils, and other seasonings. This is a great option if fish sauce and curry powder or paste aren't your thing.");
        contentList.add("How to make my ramen healthier?");
        contentList.add("Toss in some vegetables for a healthier meal. You can add delicate and quick cooking vegetables just before serving the ramen. You can also add sturdier, long cooking vegetables to the noodles as you cook them.");
        contentList.add("Give your ramen bowl extra protein with an egg.");
        contentList.add("\n" +
                "Add more protein with meat.");



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
    public static Ramen4Fragment newInstance(String param1, String param2) {
        Ramen4Fragment fragment = new Ramen4Fragment();
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
        UtilLog.d("Fragment","Pic3:onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ramen4, container, false);
        listView = (ListView) view.findViewById(R.id.fragment_ramem4_List_View);
        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this.getContext(),contentList);
        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }

}
