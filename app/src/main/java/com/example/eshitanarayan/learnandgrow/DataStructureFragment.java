package com.example.eshitanarayan.learnandgrow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class DataStructureFragment extends Fragment {

Button videobutton3,pdfbutton3,quizbutton3;
    ImageView datastructureimage;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data_structure, container, false);
        videobutton3 = (Button) view.findViewById(R.id.videodatastructurebutton);
        videobutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("https://www.youtube.com/playlist?list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P"));
                startActivity(link);
            }
        });
        pdfbutton3 = (Button)view.findViewById(R.id.pdfdatastructurebutton);
        pdfbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("http://www.tutorialspoint.com/data_structures_algorithms/data_structures_algorithms_tutorial.pdf"));
                startActivity(link);
            }
        });
        quizbutton3 = (Button)view.findViewById(R.id.quizdatastructurebutton);
        quizbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("http://www.sanfoundry.com/software-design-mcqs-algorithm-data-structure-specification/"));
                startActivity(link);
            }
        });
        datastructureimage = (ImageView)view.findViewById(R.id.datastructureimageview);
        datastructureimage.setImageResource(R.drawable.datastruncture);
        // Inflate the layout for this fragment
        return view;
    }
    }
