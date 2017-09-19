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

public class GroupDiscussionFragment extends Fragment {
 Button videobutton4,pdfbuttong;
    ImageView gdimage;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_group_discussion,container,false);
        videobutton4 = (Button)view.findViewById(R.id.videogdbutton);
        videobutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("https://www.youtube.com/watch?v=PfJg-67smf4"));
                startActivity(link);
            }
        });
        pdfbuttong = (Button)view.findViewById(R.id.pdfgdbutton);
        pdfbuttong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("http://www.sastra.edu/nptel/download/Prof%20GPRagini/pdf_New/Unit%2026.pdf"));
                startActivity(link);
            }
        });
        gdimage = (ImageView)view.findViewById(R.id.gdimageview);
        gdimage.setImageResource(R.drawable.groupdiscussion);
        // Inflate the layout for this fragment
        return view;
    }

}