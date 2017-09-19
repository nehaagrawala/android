package com.example.eshitanarayan.learnandgrow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Verbal_sectionActivity extends AppCompatActivity {
    TextView textView;
    Button buttonvideo,quizbutton8;
    ImageView verbalimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbal_section);
        textView = (TextView)findViewById(R.id.headingtextview);
        buttonvideo = (Button)findViewById(R.id.videobutton2);
        quizbutton8 = (Button)findViewById(R.id.quizbutton2);
        verbalimage = (ImageView)findViewById(R.id.verbalimageview);
        String string = getIntent().getStringExtra("Pos");
        int pos = Integer.parseInt(string);
        switch (pos)
        {
            case 0:
            {
                textView.setText("Spotting Errors");
                buttonvideo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/watch?v=0fMeFvWmAzk"));
                        startActivity(link);
                    }
                });
                quizbutton8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/verbal-ability/spotting-errors/"));
                        startActivity(link);

                    }
                }
                );
                verbalimage.setImageResource(R.drawable.spottingerror);

                break;
            }
            case 1:
            {
                textView.setText("Spellings");
                buttonvideo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/watch?v=0fMeFvWmAzk"));
                        startActivity(link);
                    }
                });
                quizbutton8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/verbal-ability/spellings/"));
                        startActivity(link);

                    }
                });
                verbalimage.setImageResource(R.drawable.spellingchk);
                break;
            }
            case 2:
            {
                textView.setText("Ordering of Sentences");
                buttonvideo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/watch?v=AP35J7ElVYc"));
                        startActivity(link);
                    }
                });
                quizbutton8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/verbal-ability/ordering-of-sentences/"));
                        startActivity(link);

                    }
                });
                verbalimage.setImageResource(R.drawable.orderngofsentence);
                break;
            }
            case 3:
            {
                textView.setText("Antonyms");
                buttonvideo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("https://www.youtube.com/watch?v=idFKTCWQihI"));
                        startActivity(link);
                    }
                });
                quizbutton8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent link = new Intent(android.content.Intent.ACTION_VIEW);
                        link.setData(Uri.parse("http://www.indiabix.com/verbal-ability/antonyms/"));
                        startActivity(link);

                    }
                });
                verbalimage.setImageResource(R.drawable.synom);
                break;
            }
        }
    }
}


