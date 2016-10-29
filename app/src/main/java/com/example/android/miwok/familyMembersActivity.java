package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class familyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words);

     ArrayList<Word> familyMembers = new ArrayList<Word>();

        familyMembers.add(new Word("Walid","Father"));
        familyMembers.add(new Word("Walida","Mother"));
        familyMembers.add(new Word("Beta","Son"));
        familyMembers.add(new Word("Beti","Daughter"));
        familyMembers.add(new Word("Dada","GrandFather"));
        familyMembers.add(new Word("Dadi","Grand Mother"));
        familyMembers.add(new Word("Bara Bhai","Elder Brother"));
        familyMembers.add(new Word("Chota Bhai","Younger Brother"));
        familyMembers.add(new Word("Bari Behn","Elder Sister"));
        familyMembers.add(new Word("Choti Behn","Younger Sister"));



        customArrayAdapter FamilyMemArray = new customArrayAdapter(this,familyMembers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(FamilyMemArray);

    }
}
