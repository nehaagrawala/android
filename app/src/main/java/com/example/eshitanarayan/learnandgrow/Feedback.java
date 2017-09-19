package com.example.eshitanarayan.learnandgrow;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {


    EditText name,email,comments,suggestions;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        name = (EditText) findViewById(R.id.namEdfeedback);
        email = (EditText) findViewById(R.id.emailEdfeedback);
        comments = (EditText) findViewById(R.id.commentsEdfeedback);
        suggestions = (EditText) findViewById(R.id.suggestionsEdfeedback);
        submit=(Button)findViewById(R.id.submitbutton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_fname = name.getText().toString();
                String str_email = email.getText().toString();
                String str_comments = comments.getText().toString();
                String str_suggestions = suggestions.getText().toString();
                String type = "register";

                Intent intent = new Intent(Feedback.this, Home.class);
                startActivity(intent);
                Toast.makeText(Feedback.this, "Successfully Feedback Submitted!!!", Toast.LENGTH_SHORT).show();

               /* FdBackgroundWorker backgroundWorker = new FdBackgroundWorker(Feedback.this);
                backgroundWorker.execute(type,str_fname,str_email,str_comments,str_suggestions);*/
                String charpattern = "[a-zA-Z]*";
                String emailpattern = "[a-zA-Z)0-9._-]+@[a-z]+\\.+[a-z]*";
                //String type="register";

                if (!str_fname.matches(charpattern) || str_fname.matches("")) {
                    TextInputLayout til = (TextInputLayout) findViewById(R.id.fdname);
                    til.setErrorEnabled(true);
                    til.setError("enter valid username");
                } else {
                    if (!str_email.matches(emailpattern) || str_email.matches("")) {

                        TextInputLayout til = (TextInputLayout) findViewById(R.id.fdemail);
                        til.setErrorEnabled(true);
                        til.setError("enter valid emailid");


                        FdBackgroundWorker backgroundWorker = new FdBackgroundWorker(Feedback.this);
                        backgroundWorker.execute(type, str_fname, str_email, str_comments, str_suggestions);
                        Toast.makeText(Feedback.this, "Successfully Feedback Submitted!!!", Toast.LENGTH_SHORT).show();

                    }
                }

            }


            });

    }




}

