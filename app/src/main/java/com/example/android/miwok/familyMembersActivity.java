package com.example.android.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class familyMembersActivity extends AppCompatActivity {
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
        final int[] resId = new int[]{R.raw.family_father,R.raw.family_mother,R.raw.family_son,R.raw.family_daughter,R.raw.family_grandfather,R.raw.family_grandmother,R.raw.family_older_brother,R.raw.family_younger_brother,R.raw.family_older_sister,R.raw.family_younger_sister};

    ArrayList<Word> familyMembers = new ArrayList<Word>();

        familyMembers.add(new Word("Walid","Father",R.drawable.family_father));
        familyMembers.add(new Word("Walida","Mother",R.drawable.family_mother));
        familyMembers.add(new Word("Beta","Son",R.drawable.family_son));
        familyMembers.add(new Word("Beti","Daughter",R.drawable.family_daughter));
        familyMembers.add(new Word("Dada","GrandFather",R.drawable.family_grandfather));
        familyMembers.add(new Word("Dadi","Grand Mother",R.drawable.family_grandmother));
        familyMembers.add(new Word("Bara Bhai","Elder Brother",R.drawable.family_older_brother));
        familyMembers.add(new Word("Chota Bhai","Younger Brother",R.drawable.family_younger_brother));
        familyMembers.add(new Word("Bari Behn","Elder Sister",R.drawable.family_older_sister));
        familyMembers.add(new Word("Choti Behn","Younger Sister",R.drawable.family_younger_sister));



        customArrayAdapter FamilyMemArray = new customArrayAdapter(this,familyMembers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(FamilyMemArray);
        listView.setBackgroundColor(Color.parseColor("#008000"));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                releaseAudioResource();

                mp = MediaPlayer.create(getApplicationContext(),resId[position]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releaseAudioResource();
                    }
                });
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

