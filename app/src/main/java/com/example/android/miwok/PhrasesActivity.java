package com.example.android.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import android.graphics.Color;

public class PhrasesActivity extends AppCompatActivity {
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



        ArrayList<Word> phrasess = new ArrayList<Word>();
        final int[] resId = new int[]{R.raw.phrase_where_are_you_going,R.raw.phrase_what_is_your_name,R.raw.phrase_my_name_is,R.raw.phrase_how_are_you_feeling,R.raw.phrase_im_feeling_good,R.raw.phrase_are_you_coming,R.raw.phrase_yes_im_coming,R.raw.phrase_im_coming,R.raw.phrase_lets_go,R.raw.phrase_come_here};

        phrasess.add(new Word("Ap kahan Ja rahe ho","Where are you going?"));
        phrasess.add(new Word("Ap ka nam kia he?","What is your name?"));
        phrasess.add(new Word("Mera Nam ... he","My name is..."));
        phrasess.add(new Word("Ap kesa mehsoos kar rahe hain","How are you feeling?"));
        phrasess.add(new Word("Me acha Mehsoos Kar raha hun","I’m feeling good."));
        phrasess.add(new Word("Kia ap aa rahe hain?","Are you coming?"));
        phrasess.add(new Word("Jee me araha hun","Yes, I’m coming"));
        phrasess.add(new Word("Me araha hun","I’m coming"));
        phrasess.add(new Word("chalte hain","Let’s go."));
        phrasess.add(new Word("Yahan aao","Come here."));



        customArrayAdapter FamilyMemArray = new customArrayAdapter(this,phrasess);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(FamilyMemArray);
        listView.setBackgroundColor(Color.parseColor("#87CEEB"));
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

