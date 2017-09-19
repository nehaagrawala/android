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


public class CFragment extends Fragment {
    Button buttonvideo1,pdfbutton1,quizbutton1;
    ImageView cimage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_c, container, false);

        buttonvideo1 = (Button)view.findViewById(R.id.videocbutton);
        buttonvideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("https://www.youtube.com/watch?v=2NWeucMKrLI&list=PL6gx4Cwl9DGAKIXv8Yr6nhGJ9Vlcjyymq"));
                startActivity(link);
            }
        });
        pdfbutton1 = (Button)view.findViewById(R.id.pdfcbutton);
        pdfbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("https://pdfbookforus.files.wordpress.com/2016/11/let-us-c-by-yashavant-kanetkar.pdf"));
                startActivity(link);
            }
        });
        quizbutton1 = (Button)view.findViewById(R.id.quizcbutton);
        quizbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("http://www.sanfoundry.com/c-programming-questions-answers-variable-names-1/"));
                startActivity(link);
            }
        });
        cimage = (ImageView)view.findViewById(R.id.ccimageview);
        cimage.setImageResource(R.drawable.c);
        return view;
    }

}