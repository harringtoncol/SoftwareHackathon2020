package com.harrington.softwarehackathon2020;

import android.Manifest;
import android.media.MediaRecorder;
import android.util.Log;

import androidx.core.app.ActivityCompat;

import java.io.IOException;

import static android.os.Environment.getExternalStorageDirectory;

public class AudioPlaying {


    public void run() {
        int n = 1;

       // ActivityCompat.requestPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE, n);

        MediaRecorder mediaRecorder = new MediaRecorder();

        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);

        mediaRecorder.setOutputFile(getExternalStorageDirectory().getAbsolutePath() + "/inputFile.txt");

        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

        try {
            mediaRecorder.prepare();
            mediaRecorder.start();
        }catch(IOException e){
            Log.e("error", "error");
        }

    }



}


