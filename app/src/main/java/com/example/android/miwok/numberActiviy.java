package com.example.android.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class numberActiviy extends AppCompatActivity {

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

        final int[] resId = new int[]{R.raw.number_one, R.raw.number_two, R.raw.number_three, R.raw.number_four, R.raw.number_five, R.raw.number_six, R.raw.number_seven, R.raw.number_eight, R.raw.number_nine, R.raw.number_ten};


        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Ek", "One", R.drawable.number_one));
        words.add(new Word("Do", "Two", R.drawable.number_two));
        words.add(new Word("Teen", "Three", R.drawable.number_three));
        words.add(new Word("Char", "Four", R.drawable.number_four));
        words.add(new Word("Panch", "Five", R.drawable.number_five));
        words.add(new Word("Chay", "Six", R.drawable.number_six));
        words.add(new Word("Sath", "Seven", R.drawable.number_seven));
        words.add(new Word("Aath", "Eight", R.drawable.number_eight));
        words.add(new Word("Noo", "Nine", R.drawable.number_nine));
        words.add(new Word("Dus", "Ten", R.drawable.number_ten));


        customArrayAdapter Adapter = new customArrayAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
        listView.setBackgroundColor(Color.parseColor("#FFA500"));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                releaseAudioResource();
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), resId[position]);
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

