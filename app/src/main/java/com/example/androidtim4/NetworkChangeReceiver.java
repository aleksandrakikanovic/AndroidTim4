package com.example.androidtim4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

public class NetworkChangeReceiver extends BroadcastReceiver {

    Context context;

    @Override
    public void onReceive(final Context context, final Intent intent) {

        Log.v(SplashActivity.LOG_TAG, "Receieved notification about network status");
        isNetworkAvailable(context);
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager)
            context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        if(!SplashActivity.isConnected){
                            SplashActivity.isConnected = true;
                        }
                        return true;
                    }
                }
            }
        }
        Toast.makeText(context, "No connection to Internet", Toast.LENGTH_LONG).show();
        SplashActivity.isConnected = false;
        return false;
    }

}
