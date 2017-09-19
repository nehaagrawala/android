package com.example.eshitanarayan.learnandgrow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Signin,Signup,googleSignin;
    private  String TAG = MainActivity.class.getSimpleName();
    EditText email,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.emailEditText);
        pass= (EditText)findViewById(R.id.passwordEditText);
        Signup = (Button)findViewById(R.id.signupbutton);
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);
            }
        });
        Signin = (Button)findViewById(R.id.signInbutton);
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str_eml=email.getText().toString();
                String str_pas=pass.getText().toString();

                String type="register";

                if(str_eml.equals("") && str_pas.equals("")) {
                    Toast.makeText(MainActivity.this, "Empty Field", Toast.LENGTH_SHORT).show();
                }else{
                    SigninBackgroundWorker backgroundWorker = new SigninBackgroundWorker(MainActivity.this, 0);
                    backgroundWorker.execute(type, str_eml, str_pas, TAG);
                }
               // Intent i = new Intent(MainActivity.this,Home.class);
               // startActivity(i);
            }
        });
        googleSignin = (Button)findViewById(R.id.gsignin);
        googleSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this,GoogleSignin.class);
                startActivity(inte);
            }
        });
    }
}
