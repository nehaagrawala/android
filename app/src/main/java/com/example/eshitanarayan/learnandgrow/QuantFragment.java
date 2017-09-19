package com.example.eshitanarayan.learnandgrow;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuantFragment extends Fragment {

    RecyclerView quantrecview;
    CustomAdapterQuant customAdapterQuant;
    static ArrayList<QuantTopics> quantTopicsArrayList = new ArrayList<QuantTopics>();
    String[]name={"Ratio and Proportation","Time&Work","Profit Loss","Average"};

    public QuantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_quant, container, false);

        for (int i=0;i<4;i++)
        {
            QuantTopics quantTopics = new QuantTopics(name[i]);
            quantTopicsArrayList.add(quantTopics);
        }

        quantrecview = (RecyclerView)view.findViewById(R.id.recviewquant);
        RecyclerView.LayoutManager mlayout = new LinearLayoutManager(getContext());
        customAdapterQuant = new CustomAdapterQuant(getContext());
        quantrecview.setLayoutManager(mlayout);
        quantrecview.setItemAnimator(new DefaultItemAnimator());
        quantrecview.setAdapter(customAdapterQuant);

        return  view;
    }

}
