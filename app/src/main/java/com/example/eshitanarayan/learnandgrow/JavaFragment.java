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


public class JavaFragment extends Fragment {
    Button videobutton2,pdfbutton2,quizbutton3;
    ImageView javaimage;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_java, container, false);
        videobutton2 = (Button) view.findViewById(R.id.videojavabutton);
        videobutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("https://www.youtube.com/playlist?list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al"));
                startActivity(link);
            }
        });
        pdfbutton2 = (Button)view.findViewById(R.id.pdfjavabutton);
        pdfbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("http://iiti.ac.in/people/~tanimad/JavaTheCompleteReference.pdf"));
                startActivity(link);
            }
        });
        quizbutton3 = (Button)view.findViewById(R.id.quizjavabutton);
        quizbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("http://www.sanfoundry.com/java-mcqs-integer-floating-data-types/"));
                startActivity(link);
            }
        });
        javaimage = (ImageView)view.findViewById(R.id.javaimageview);
        javaimage.setImageResource(R.drawable.java1);
        // Inflate the layout for this fragment
        return view;
    }
}
