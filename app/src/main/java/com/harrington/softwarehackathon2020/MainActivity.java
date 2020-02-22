package com.harrington.softwarehackathon2020;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ImageButton recordButton = findViewById(R.id.buttonMic);
        final ImageButton playButton = findViewById((R.id.butn4));


        playButton.setVisibility(View.INVISIBLE);

        recordButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AudioPlaying audioPlayer = new AudioPlaying();

                audioPlayer.run();
                // audio.onRequestPermissionsResult();
                //audio.startRecording();
                recordButton.setVisibility(View.INVISIBLE);
                playButton.setVisibility(View.VISIBLE);
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {



                recordButton.setVisibility(View.VISIBLE);
                playButton.setVisibility(View.INVISIBLE);
        }
    });

}

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
