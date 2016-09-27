package com.example.ziyi.startservicepractice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int onStartCommand(Intent intent,int flags,int startId){
        int index = intent.getIntExtra("no",23333);
        Log.v("tag","The number is "+index);
        return super.onStartCommand(intent,flags,startId);
    }
}
