package com.harrington.softwarehackathon2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    RecordAudio audio = new RecordAudio();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
       final ImageButton recordButton = findViewById(R.id.buttonMic);
       final ImageButton playButton = findViewById((R.id.butn4));
        playButton.setVisibility(View.INVISIBLE);

        recordButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              //  audio.startRecording();
                recordButton.setVisibility(View.INVISIBLE);
                playButton.setVisibility(View.VISIBLE);
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

            }
        });

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
