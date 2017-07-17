package com.example.xu.chenfinalproject.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.xu.chenfinalproject.Adapter.AdvanceListViewAdapter;
import com.example.xu.chenfinalproject.Adapter.ListNormalAdapter;
import com.example.xu.chenfinalproject.R;
import com.example.xu.chenfinalproject.util.UtilLog;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Ramen3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Ramen3Fragment extends Fragment {
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


    public Ramen3Fragment() {


            context = getContext();
            contentList = new ArrayList<String>();
            contentList.add("1\n" +
                    "Bring the water to a boil. Pour 2½ cups (590 milliliters) of water into a saucepan. Place the saucepan on the stove and bring the water to a boil over high heat.");
            contentList.add("2\n" +
                    "Stir in the soup base. Tear open the seasoning packet that came with your ramen. Pour the contents into the boiling water and give it a stir.");
            contentList.add("3\n" +
                    "Allow the broth to cook for 1 minute. This ensures that the powder dissolves completely and that the water is hot enough for the next step.");
            contentList.add("4\n" +
                    "Add in the noodles. Gently press down on the noodles with a chopstick or a wooden spoon so that they sink into the water. You may have to hold them down for a little bit. Do not break the noodles in half or stir them. They will separate on their own.");
            contentList.add("5\n" +
                    "Cook the noodles for about 2 minutes. Once they start to break apart, pull them out of the broth using a pair of chopsticks or tongs.[6] You can also pour the broth into a serving bowl through a strainer.");
            contentList.add("6\n" +
                    "Fan the noodles. This will help stop the cooking process and prevent them from turning limp and soggy. You can use a hand-held fan, a little electric fan, or even a stiff piece of paper or a folder.");
            contentList.add("7\n" +
                    "Add the noodles back to the broth. At this point, you can add some tasty toppings, such as an egg, meat, or vegetables.");
            contentList.add("8\n" +
                    "Serve the ramen. Pour the ramen into a large, deep bowl. If you added a pouched or fried egg into the pot, consider scooping it out with a soup ladle, then placing it back on top of the ramen, after it's already in the bowl. At this point, you can also add other toppings, such as cooked meat.");


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
    public static Ramen3Fragment newInstance(String param1, String param2) {
        Ramen3Fragment fragment = new Ramen3Fragment();
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

        View view = inflater.inflate(R.layout.fragment_ramen3, container, false);
        listView = (ListView) view.findViewById(R.id.fragment_ramem3_List_View);
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(),contentList);
        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }

}
