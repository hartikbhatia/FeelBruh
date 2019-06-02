package com.example.bhatia.feelbruh;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class workoutt extends AppCompatActivity {

    private ImageView stop, play, pause;
    private MediaPlayer mp;

    private SeekBar seekBar;
    private Runnable run;
    private Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workoutt);

        stop = (ImageView) findViewById(R.id.stop);
        play = (ImageView) findViewById(R.id.play);
        pause = (ImageView) findViewById(R.id.pause);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        handler = new Handler();

        mp = MediaPlayer.create(getApplicationContext(), R.raw.closer);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp.isPlaying()) {
                    mp.pause();



                } else {
                    mp.start();

                    changeseekbar();

                }


            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();

            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.stop();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.closer);


            }
        });
        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                seekBar.setMax(mp.getDuration());
                mp.start();
                changeseekbar();


            }


        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b) {
                    mp.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void changeseekbar() {

        seekBar.setProgress(mp.getCurrentPosition());
        if (mp.isPlaying()) {
            run = new Runnable() {
                @Override
                public void run() {
                    changeseekbar();
                }
            };
            handler.postDelayed(run, 1000);

        }


    }
}