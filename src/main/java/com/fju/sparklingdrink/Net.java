package com.fju.sparklingdrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Net {
    public void shownet(){
        String content = "";
        int indexS = 0;
        int indexE = 0;
        String title = "";
        String text = "";

        try {
            URL url = new URL("https://www.ec-ff.com/blog/posts/fancy-water-about-sparkling-water");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            StringBuffer sb = new StringBuffer();
            String line = in.readLine();
            while (line != null) {
                sb.append(line);
                line = in.readLine();
            }
            //System.out.println(sb.toString());
            content = sb.toString();

            indexS = content.indexOf("<title>")+("<title>").length();
            indexE = content.indexOf("</title>");
            title = content.substring( indexS,indexE);

            indexS = content.indexOf("content")+("content").length()+2;
            indexE = content.indexOf("。\"><!")+1;
            text = content.substring( indexS,indexE);

            //System.out.println("indexS= " + indexS);
            // System.out.println("indexE= " + indexE);
            System.out.println("title： " + title);
            System.out.println("text： " + text);
        }catch (MalformedParameterizedTypeException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
