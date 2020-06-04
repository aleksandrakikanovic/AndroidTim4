package sync;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.Settings;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.example.androidtim4.MainActivity;
import com.example.androidtim4.R;

import tools.EmailTools;

public class SyncReceiver extends BroadcastReceiver {
    private static int notificationID = 1;
    private static String channelID = "M_CH_ID";


    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("REZ", "onReceive");

        NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, channelID);

        if (intent.getAction().equals(MainActivity.SYNC_DATA)) {
            int resultCode = intent.getExtras().getInt(SyncService.RESULT);
            Bitmap bm = null;

            Intent wiFiintent = new Intent(Settings.ACTION_WIFI_SETTINGS);
            PendingIntent pIntent = PendingIntent.getActivity(context, 0, wiFiintent, 0);

            if (resultCode == EmailTools.TYPE_NOT_CONNECTED) {
                mBuilder.setContentTitle(context.getString(R.string.autosync_problem));
                mBuilder.setContentText(context.getString(R.string.no_internet));

            } else if (resultCode == EmailTools.TYPE_MOBILE) {
                mBuilder.setContentTitle(context.getString(R.string.autosync_warning));
                mBuilder.setContentText(context.getString(R.string.connect_to_wifi));

            } else {
                mBuilder.setContentTitle(context.getString(R.string.autosync));
                mBuilder.setContentText(context.getString(R.string.good_news_sync));
            }


            mBuilder.setLargeIcon(bm);
            // notificationID allows you to update the notification later on.
            mNotificationManager.notify(notificationID, mBuilder.build());
        }
    }
}