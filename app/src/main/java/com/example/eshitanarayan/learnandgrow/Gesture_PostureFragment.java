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


public class Gesture_PostureFragment extends Fragment {
 Button videobutton6,pdfbutton3;
    ImageView gpimage;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gesture__posture,container,false);
        videobutton6 = (Button)view.findViewById(R.id.videogpbutton);
        videobutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("https://www.youtube.com/watch?v=tS2HC0ezk3w&t=23s"));
                startActivity(link);
            }
        });
        pdfbutton3 = (Button)view.findViewById(R.id.pdfgpbutton);
        pdfbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("http://web.mst.edu/~toast/docs/Gestures.pdf"));
                startActivity(link);
            }
        });
        gpimage = (ImageView)view.findViewById(R.id.gpimageview);
        gpimage.setImageResource(R.drawable.gesture);


        // Inflate the layout for this fragment
        return view;
    }
}