package com.forthknight.simpleairhockey.util;

import android.util.Log;

/**
 * Created by xiongyikai on 2017/4/22.
 */

public class Logger {

    public static final boolean DEBUG = true;

    public static void debug(String tag , String msg){
        if (DEBUG){
            Log.d(tag , msg);
        }
    }

}
