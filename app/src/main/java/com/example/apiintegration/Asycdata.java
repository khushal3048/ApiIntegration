package com.example.apiintegration;

import android.os.AsyncTask;

public class Asycdata extends AsyncTask<String,Void,String> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    @Override
    protected String doInBackground(String... strings) {

        String jsonurl = strings[0];

        HttpHandler sh = new HttpHandler();

        String json = sh.makeServicecall(jsonurl);
        System.out.println("This is a Json : " + json);

        return json;
    }
}
