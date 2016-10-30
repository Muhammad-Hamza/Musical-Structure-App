package com.example.android.miwok;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class familyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words);

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




    }
}
