package com.example.eshitanarayan.learnandgrow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        textView = (TextView)findViewById(R.id.aboutusTextview);
        textView.setText("Learn and Grow is all about preparation for placement.In this first user have to sign in or sign up,If he/she want to login with g+ then they can login through their gmail id.\n" +
                "Learn and Grow app has 4 sections -"
                +"\n1: Resume/Cover Letter:"+"\nUser can download the resume and cover letter's standard format directly from the app."
                +"\n2: Aptitude/Resoning:"+"\nIn this we provide topics which are important in aptitude exam and their formula's ,questions, videos or PDF for all quantitative aptitude,reasoning,and verbal."
                +"\n3: Technical:"+"\nIn this section we cover the important subjects of the technical domain for the placement point of view and their videos ,PDF books and questions."
                +"\n4: Personality Development:"+"\nIn this we provide information about  effectiveCommunication,gesture/Posture,Group Discussion etc.");
    }
}
