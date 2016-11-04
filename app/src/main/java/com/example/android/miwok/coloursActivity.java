package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT;


public class coloursActivity extends AppCompatActivity {



    MediaPlayer mp;
    private MediaPlayer.OnCompletionListener mOnCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseAudioResource();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words);


        ArrayList<Word> colourWords = new ArrayList<Word>();
        final int[] resId = new int[]{R.raw.color_red,R.raw.color_green,R.raw.color_brown,R.raw.color_gray,R.raw.color_black,R.raw.color_white,R.raw.color_dusty_yellow,R.raw.color_mustard_yellow};


        colourWords.add(new Word("Lal", "Red",R.drawable.color_red));
        colourWords.add(new Word("Hara","Green" ,R.drawable.color_green));
        colourWords.add(new Word("Kathai", "Brown",R.drawable.color_brown));
        colourWords.add(new Word("Surmai", "Gray",R.drawable.color_gray));
        colourWords.add(new Word("kala", "Black",R.drawable.color_black));
        colourWords.add(new Word("sufaid", "White",R.drawable.color_white));
        colourWords.add(new Word("dhoolzard", "Dust Yellow",R.drawable.color_dusty_yellow));
        colourWords.add(new Word("peele sarsu", "Mustard Yellow",R.drawable.color_mustard_yellow));


        customArrayAdapter colourArray = new customArrayAdapter(this, colourWords);


        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(colourArray);
        listView.setBackgroundColor(Color.parseColor("#800080"));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                releaseAudioResource();
                 mp = MediaPlayer.create(getApplicationContext(),resId[position]);
                mp.start();

                mp.setOnCompletionListener(mOnCompletionListener);
            }
        });
    }

    @Override
    public void onStop()
    {
        super.onStop();
        releaseAudioResource();

    }
    public void releaseAudioResource()
    {
        if(mp != null) {
            mp.release();

            mp = null;
        }
    }

}
