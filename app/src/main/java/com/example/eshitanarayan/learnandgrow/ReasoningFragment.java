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
public class ReasoningFragment extends Fragment {

    RecyclerView reasoningrecview;
    CustomAdapterReasoning customAdapterreasoning;
    static ArrayList<ReasoningTopics> reasoningTopicsArrayList = new ArrayList<ReasoningTopics>();
    String[]name={"Seating Arrangement","Number Series","bloodRelation","Cause And Effect"};

    public ReasoningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reasoning, container, false);

        for (int i=0;i<4;i++)
        {
            ReasoningTopics reasoningTopics = new  ReasoningTopics(name[i]);
            reasoningTopicsArrayList.add(reasoningTopics);
        }

        reasoningrecview = (RecyclerView)view.findViewById(R.id.recviewreasoning);
        RecyclerView.LayoutManager mlayout = new LinearLayoutManager(getContext());
        customAdapterreasoning = new CustomAdapterReasoning(getContext());
        reasoningrecview.setLayoutManager(mlayout);
        reasoningrecview.setItemAnimator(new DefaultItemAnimator());
        reasoningrecview.setAdapter(customAdapterreasoning);

        return  view;
    }

}
