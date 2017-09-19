package com.example.eshitanarayan.learnandgrow;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Quant_sectionActivity extends AppCompatActivity {

    TextView textView;
    Button buttonvideo,buttonquiz;
    ImageView quantimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quant_section);
        textView = (TextView)findViewById(R.id.formulatextview);
        buttonvideo = (Button)findViewById(R.id.videobutton);
        buttonquiz = (Button)findViewById(R.id.quizbutton);
        quantimage = (ImageView)findViewById(R.id.quantimageview);
        String string = getIntent().getStringExtra("Pos");
        int pos = Integer.parseInt(string);
        switch (pos)
        {
            case 0:
            {
                textView.setText("Ratio and Proportion");
                buttonvideo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/playlist?list=PLY3DFj1jjj0V4YVXS80OFcKid5WnjPvvu"));
                        startActivity(link);
                    }
                });
                buttonquiz.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/aptitude/ratio-and-proportion/"));
                        startActivity(link);
                    }
                });
                quantimage.setImageResource(R.drawable.ratio);
                break;
            }
            case 1:
            {
                textView.setText("Time and Work");
                buttonvideo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/watch?v=M_UEJZwI1WQ&list=PLY3DFj1jjj0WcRsrqQJKZyMlHgDepbABo"));
                        startActivity(link);
                    }
                });
                buttonquiz.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/aptitude/time-and-work/"));
                        startActivity(link);
                    }
                });
                quantimage.setImageResource(R.drawable.timeandwork);
                break;
            }
            case 2:
            {
                textView.setText("Profit Loss");
                buttonvideo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/watch?v=QvAOolY0ohc&list=PLY3DFj1jjj0WzbJqXLqIG-rDPChqvlKIw"));
                        startActivity(link);
                    }
                });
                buttonquiz.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/aptitude/profit-and-loss/"));
                        startActivity(link);
                    }
                });
                quantimage.setImageResource(R.drawable.profitandloss);
                break;
            }
            case 3:
            {
                textView.setText("Average");
                buttonvideo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/playlist?list=PLY3DFj1jjj0WLxhE6WX_Jw7dEbRTVwKkJ"));
                        startActivity(link);
                    }
                });
                buttonquiz.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/aptitude/average/"));
                        startActivity(link);
                    }
                });
                quantimage.setImageResource(R.drawable.average);
                break;
            }
        }
    }
}
