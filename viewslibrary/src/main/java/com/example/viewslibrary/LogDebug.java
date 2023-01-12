package com.example.viewslibrary;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "AwesomeTag";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
