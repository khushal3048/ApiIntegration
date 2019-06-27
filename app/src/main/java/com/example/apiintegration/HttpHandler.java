package com.example.apiintegration;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpHandler {

    public HttpHandler() {
    }

    public String makeServicecall(String rurl){

        String response = null;

        try {

            URL url = new URL(rurl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type","application/json");

            // Read Response

            InputStream in = new BufferedInputStream(con.getInputStream());

            response = convertStream(in);


        }catch (MalformedURLException e){

            Log.e("HttpHandler Class","MalformedURLException :" + e.getMessage() );

        }catch (IOException e){

            Log.e("HttpHandler Class","IOException :" + e.getMessage() );

        }


        return response;
    }

    public String convertStream(InputStream is){

        BufferedReader read = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb  = new StringBuilder();
        String line;

        try {

            while ((line = read.readLine()) != null){

                sb.append(line).append("\n");
            }

        }catch (IOException e){

            Log.e("ConvertStream","IOException :" + e.getMessage() );

        }finally {

            try {

                is.close();

            }catch (IOException e){

                Log.e("ConvertStreamFinally","IOException :" + e.getMessage() );

            }
        }

        return sb.toString();
    }
}
