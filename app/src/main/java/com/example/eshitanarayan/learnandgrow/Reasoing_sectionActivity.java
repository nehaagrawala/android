package com.example.eshitanarayan.learnandgrow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Reasoing_sectionActivity extends AppCompatActivity {
TextView textView;
    Button videobutton,quizbutton;
    ImageView imageview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reasoing_section);
        textView = (TextView)findViewById(R.id.headingtextview1);

            videobutton =(Button)findViewById(R.id.videobutton3);
        quizbutton = (Button)findViewById(R.id.quizbutton3);
        imageview2 = (ImageView)findViewById(R.id.reasoingimageview);
        String string = getIntent().getStringExtra("Pos");
        int pos = Integer.parseInt(string);
        switch (pos)
        {
            case 0:
            {
                textView.setText("Seating Arrangement");
                videobutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/playlist?list=PLY3DFj1jjj0V2BM4TiJ51GLlCBUezrzV7"));
                        startActivity(link);
                    }
                });
                quizbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/verbal-reasoning/seating-arrangement/"));
                        startActivity(link);
                    }
                });
                imageview2.setImageResource(R.drawable.seatingarrangment);

                break;
            }
            case 1:
            {
                textView.setText("Number Series");
                videobutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/watch?v=dWbihrkEtcA&list=PL9qgP7MoL__6RWI1nKbl2QlCoCMdDN30b&index=5"));
                        startActivity(link);
                    }
                });
                quizbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/logical-reasoning/number-series/"));
                        startActivity(link);
                    }
                });
                imageview2.setImageResource(R.drawable.numberseries);
                break;
            }
            case 2:
            {
                textView.setText("bloodRelation");
                videobutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/playlist?list=PLY3DFj1jjj0Ursxd54PJP6wr6D6wODL7"));
                        startActivity(link);
                    }
                });
                quizbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/verbal-reasoning/blood-relation-test/"));
                        startActivity(link);
                    }
                });
                imageview2.setImageResource(R.drawable.bloodrelation);
                break;
            }
            case 3:
            {
                textView.setText("Cause and Effect");
                videobutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/watch?v=gjJ2C89-7fY&list=PLxMIqnmIAYm49bgLVLwhvUlVksDAh1C-G"));
                        startActivity(link);
                    }
                });
                quizbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/logical-reasoning/cause-and-effect/"));
                        startActivity(link);
                    }
                });
                imageview2.setImageResource(R.drawable.causeandeffect);
                break;
            }
        }
    }
}

