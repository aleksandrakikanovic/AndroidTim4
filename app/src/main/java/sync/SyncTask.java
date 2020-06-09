package sync;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import com.example.androidtim4.EmailsActivity;
import com.example.androidtim4.MainActivity;

import tools.EmailTools;

public class SyncTask  {//extends AsyncTask<Void, Void, Void> {

//    private Context context;
//    public static String RESULT = "RESULT";
//    public SyncTask(Context context) {this.context = context;}
//
//    @Override
//    protected void onPreExecute(){
//
//    }
//    @Override
//    protected Void doInBackground(Void... params){
//        Log.i("REZ", "doInBackground");
//        try {
//            Thread.sleep(1000);
//        } catch(InterruptedException e){
//            e.printStackTrace();
//        }
//        return null;
//    }
//    @Override
//    protected void onPostExecute(Void result){
//        Log.i("REZ", "onPostExecute");
//        Intent ints = new Intent(MainActivity.SYNC_DATA);
//        int status = EmailTools.getConnectionStatus(context);
//        ints.putExtra(RESULT,status);
//        context.sendBroadcast(ints);
//    }
}
