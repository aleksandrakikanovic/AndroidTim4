package sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import tools.EmailTools;

public class SyncService extends Service {

    public static String RESULT = "RESULT";

    @Override
    public int onStartCommand (Intent intent, int flags, int startId){
        Log.i("REZ", "onStartCommand");
        int status = EmailTools.getConnectionStatus(getApplicationContext());
        if(status == EmailTools.TYPE_WIFI || status == EmailTools.TYPE_MOBILE){
            new SyncTask(getApplicationContext()).execute();
        }
        stopSelf();
        return START_NOT_STICKY;
    }
    @Override
    public IBinder onBind(Intent arg0){return null;}
}
