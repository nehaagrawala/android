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
public class VerbalFragment extends Fragment {

    RecyclerView verbalrecview;
    CustomAdapterVerbal customAdapterverbal;
    static ArrayList<VerbalTopics> verbalTopicsArrayList = new ArrayList<VerbalTopics>();
    String[]name={"Spotting Errors","Spellings","Ordering of Sentences","Synoyms/Antonyms"};

    public VerbalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_verbal, container, false);

        for (int i=0;i<4;i++)
        {
            VerbalTopics verbalTopics = new VerbalTopics(name[i]);
            verbalTopicsArrayList.add(verbalTopics);
        }

        verbalrecview = (RecyclerView)view.findViewById(R.id.recviewverbal);
        RecyclerView.LayoutManager mlayout = new LinearLayoutManager(getContext());
        customAdapterverbal = new CustomAdapterVerbal(getContext());
        verbalrecview.setLayoutManager(mlayout);
        verbalrecview.setItemAnimator(new DefaultItemAnimator());
        verbalrecview.setAdapter(customAdapterverbal);

        return  view;
    }

}

