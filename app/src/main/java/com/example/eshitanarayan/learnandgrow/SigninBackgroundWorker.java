package com.example.eshitanarayan.learnandgrow;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;



public  class SigninBackgroundWorker extends AsyncTask<String, Void, String> {

    Context context;
    AlertDialog alertDialog;
    int flag;

    SigninBackgroundWorker(Context ctx, int flag) {
        context = ctx;
        this.flag = flag;
    }
    SigninBackgroundWorker(Context ctx) {
        context = ctx;

    }

    @Override
    protected String doInBackground(String... params) {
        String type = params[0];

        if (flag == 1) {
            String register_url = "http://192.168.43.155/learnandgrow/login.php";
            try {
                String email = params[1];
                String password = params[2];


                URL url = new URL(register_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));

                String post_data = URLEncoder.encode("uemail", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8") + "&"
                        + URLEncoder.encode("upassword", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");

                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                String result = "";
                String line = "";

                while ((line = bufferedReader.readLine()) != null) {

                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();

                Log.d("result", result);

                return result;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //--------------------code ----------------------------------------//
        if (flag == 0) {
            Log.d("Json++", "flag :" + flag);
            String usernameAsync = params[1];
            String passwordAsync = params[2];
            String _tag = params[3];
            // Log.d("CHECK++", "" + usernameAsync);
            Log.d("CHECK++",""+_tag);
            HttpHandler sh = new HttpHandler();
            //  String str_url = "";
            String str_url = "http://192.168.43.155/learnandgrow/login.php";

            //String str_url = "http://192.168.0.10/running/login.php";
            String jsonStr = sh.makeServiceCall(str_url, usernameAsync, passwordAsync);
            Log.d("JSON++", "" + str_url);
            Log.d("JSON++", "" + jsonStr);
            Log.d(usernameAsync, "Response from url: " + jsonStr);
            return jsonStr;
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        alertDialog =new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Login Status");
    }

    @Override
    protected void onPostExecute(String jsonStr) {
        String email = null;
        String name=null;
        //---------------json parser --------------------------------------//
        if (flag == 0) {
            if (jsonStr != null) {
                try {
                    JSONObject jsonObject = new JSONObject(jsonStr);
                    JSONArray result = jsonObject.getJSONArray("result");

                    for (int i = 0; i < result.length(); i++) {

                        JSONObject r = result.getJSONObject(i);
                        Log.d("JSON++",""+r.toString());

                        if (r.getString("email") != null) {
                            email = r.getString("email");
                            name=r.getString("username");
                            Log.d("JSON++","email "+email);
                            Intent intent = new Intent(context, Home.class);
                            if (email != null) {
                                intent.putExtra("USER",name);
                                intent.putExtra("EMAIL", email);
                                context.startActivity(intent);
                            }

                        } else {
                            email = null;

                        }

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

}
