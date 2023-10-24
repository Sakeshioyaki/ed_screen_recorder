package com.ed_screen_recorder.ed_screen_recorder;

import android.os.Build;

import androidx.annotation.RequiresApi;

public interface HBRecorderListener {
    void HBRecorderOnStart();
    void HBRecorderOnComplete();
    void HBRecorderOnError(int errorCode, String reason);
    @RequiresApi(api = Build.VERSION_CODES.N)
    void HBRecorderOnPause();
    @RequiresApi(api = Build.VERSION_CODES.N)
    void HBRecorderOnResume();
}