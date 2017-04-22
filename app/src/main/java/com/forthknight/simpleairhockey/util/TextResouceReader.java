package com.forthknight.simpleairhockey.util;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by xiongyikai on 2017/4/22.
 */

public class TextResouceReader {

    private static final String TAG = TextResouceReader.class.getSimpleName();

    public static String readTextFileFromResource(Context context , int resourceId){

        StringBuilder body = new StringBuilder();

        InputStream inputStream = null;
        InputStreamReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            inputStream = context.getResources().openRawResource(resourceId);
            reader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                body.append(line + "\n");
            }
        }catch (Exception e){
            Logger.debug(TAG , "read file has error : " + e.toString());
        }finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
                if (reader != null){
                    reader.close();
                }
                if (inputStream != null){
                    inputStream.close();
                }
            }catch (Exception e){}
        }
        return body.toString();
    }

}
