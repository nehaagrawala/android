package com.example.eshitanarayan.learnandgrow;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;

    /*TextView uname,email;*/

    CustomAdapter ca;
    static ArrayList<Allsection> list = new ArrayList<Allsection>();
    int []img={R.drawable.resume,R.drawable.aptitudebutton,R.drawable.technical,R.drawable.pdp};
    String[]name={"Resume/Cover Letter","Aptitude/Resoning","Technical","Personality Developement"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        for (int i =0;i<4;i++)
        {
            Allsection allsection = new Allsection(img[i],name[i]);
            list.add(allsection);
        }



        recyclerView = (RecyclerView)findViewById(R.id.recview);
     //  RecyclerView.LayoutManager mlayout = new LinearLayoutManager(getApplicationContext());
        ca = new CustomAdapter(Home.this);
        gridLayoutManager = new GridLayoutManager(Home.this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(ca);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

       /* View header=navigationView.getHeaderView(0);

        uname=(TextView)findViewById(R.id.id_user);
        email=(TextView)findViewById(R.id.id_email);
        uname.setText(getIntent().getStringExtra("USER"));
        email.setText(getIntent().getStringExtra("EMAIL"));*/

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       if (id == R.id.logout_settings) {
           SharedPreferences myPrefs = getSharedPreferences("MY",
                   MODE_PRIVATE);
           SharedPreferences.Editor editor = myPrefs.edit();
           editor.clear();
           editor.commit();
           AppState.getSingleInstance().setLoggingOut(true);

           Intent intent = new Intent(Home.this,
                   MainActivity.class);
           intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
           startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

       if (id == R.id.aboutus) {
            Intent i = new Intent(Home.this,AboutUs.class);
           startActivity(i);
        } else if (id == R.id.contact) {
           Intent i = new Intent(Home.this,ContactUs.class);
           startActivity(i);
        } else if (id == R.id.feedback) {

           Intent intent = new Intent(Home.this,Feedback.class);
           startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
