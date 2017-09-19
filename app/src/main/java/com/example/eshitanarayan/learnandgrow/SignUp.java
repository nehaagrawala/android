package com.example.eshitanarayan.learnandgrow;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText name,email,password,confirmpassword;

    Button register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = (EditText)findViewById(R.id.namEd);
        email = (EditText)findViewById(R.id.emailEd);
        password = (EditText)findViewById(R.id.passEd);
        confirmpassword = (EditText)findViewById(R.id.cnfpassEd);

        register= (Button)findViewById(R.id.registerbutton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_fname=name.getText().toString();
                String str_email=email.getText().toString();
                String str_pass=password.getText().toString();
                String str_cnfpas=confirmpassword.getText().toString();
                String charpattern = "[a-zA-Z]*";
                String emailpattern = "[a-zA-Z)0-9._-]+@[a-z]+\\.+[a-z]*";
                String type="register";

                if(!str_fname.matches(charpattern) || str_fname.matches(""))
                {
                    TextInputLayout til = (TextInputLayout)findViewById(R.id.nameUI);
                    til.setErrorEnabled(true);
                    til.setError("enter valid username");
                }

                else if(!str_email.matches(emailpattern)|| str_email.matches("")){

                    TextInputLayout til = (TextInputLayout)findViewById(R.id.emailUI);
                    til.setErrorEnabled(true);
                    til.setError("enter valid emailid");

                }
                else if(!str_pass.matches((str_cnfpas))){

                    TextInputLayout til = (TextInputLayout)findViewById(R.id.passUI);
                    til.setErrorEnabled(true);
                    til.setError("enter valid password");

                }
          /*  else if(!str_cnfpas.matches("")){

                TextInputLayout til = (TextInputLayout)findViewById(R.id.cnfpassUI);
                til.setErrorEnabled(true);
                til.setError("enter valid confirm password");

            }*/

                else {
                    if (str_pass.matches((str_cnfpas))) {

                        Intent intent = new Intent(SignUp.this, MainActivity.class);
                        startActivity(intent);
                        Toast.makeText(SignUp.this, "Successfully Registered!!!", Toast.LENGTH_SHORT).show();

                        BackgroundWorker backgroundWorker = new BackgroundWorker(SignUp.this);
                        backgroundWorker.execute(type, str_fname, str_email, str_pass, str_cnfpas);

                    }
                }
            }
        });
    }
}
