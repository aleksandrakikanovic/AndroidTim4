package com.example.androidtim4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    public static final String LOG_TAG = "CheckNetworkStatus";
    public static NetworkChangeReceiver receiver = new NetworkChangeReceiver();
    public static boolean isConnected = false;
    Context context = this;
    public static IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
                if(NetworkChangeReceiver.isNetworkAvailable(context)){
                    Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                    startActivity(intent);
                }else{
                   alert();
                }
    }
    private void alert(){
        AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(
                SplashActivity.this);
        alertDialog2.setTitle("No connection...");
        alertDialog2.setMessage("Please connect to Internet ");
        alertDialog2.setIcon(android.R.drawable.ic_dialog_alert);
        alertDialog2.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        SplashActivity.this.finish();
                        System.exit(0);
                    }
                });
        alertDialog2.show();
    }

    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onRestart() {
        super.onRestart();
    }
    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    public void onPause() {
        super.onPause();
    }
    @Override
    public void onStop() {
        super.onStop();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
