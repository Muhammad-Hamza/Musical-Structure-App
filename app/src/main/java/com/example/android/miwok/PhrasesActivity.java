package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words);


        ArrayList<Word> phrasess = new ArrayList<Word>();

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

    }
}


