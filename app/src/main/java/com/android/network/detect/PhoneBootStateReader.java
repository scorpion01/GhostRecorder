package com.android.network.detect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PhoneBootStateReader extends BroadcastReceiver {

    static boolean sPhonedBooted = false;

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context, DetectorService.class);
        context.startService(intent1);
        Intent runUpload = new Intent(context, UploadRecordingTask.class);
        context.startService(runUpload);
    }
}
