package com.example.eshitanarayan.learnandgrow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
Thread t1 = new Thread()
{
    @Override
    public void run() {
        try
        {
            sleep(3000);
            Intent intent = new Intent(Splash.this,MainActivity.class);
            startActivity(intent);
            finish();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
};
        t1.start();


    }
}
