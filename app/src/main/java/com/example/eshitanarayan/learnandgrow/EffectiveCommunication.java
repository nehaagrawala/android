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


public class EffectiveCommunication extends Fragment {
Button videobutton5,pdfbuttone;
    ImageView ecimage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_effective_communication,container,false);
        videobutton5 = (Button)view.findViewById(R.id.videoecbutton);
        videobutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("https://www.youtube.com/watch?v=GNo98GjkHZU"));
                startActivity(link);
            }
        });
        pdfbuttone = (Button)view.findViewById(R.id.pdfecbutton);
        pdfbuttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                link.setData(Uri.parse("https://www.google.co.in/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=0ahUKEwi3noPost3RAhWLgI8KHTMdC4IQFggZMAA&url=http%3A%2F%2Fwww.free-management-ebooks.com%2Fdldebk-pdf%2Ffme-effective-communication.pdf&usg=AFQjCNESEweP9bGteAN1KowWbZ38pv5QCg\n"));
                startActivity(link);
            }
        });
        ecimage = (ImageView)view.findViewById(R.id.ecimageview);
        ecimage.setImageResource(R.drawable.effectivecommunication);

        // Inflate the layout for this fragment
        return view;
    }
}