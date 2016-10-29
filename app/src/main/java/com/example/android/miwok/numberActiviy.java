package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class numberActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Ek","One"));
        words.add(new Word("Do","Two"));
        words.add(new Word("Teen","Three"));
        words.add(new Word("Char","Four"));
        words.add(new Word("Panch","Five"));
        words.add(new Word("Chay","Six"));
        words.add(new Word("Sath","Seven"));
        words.add(new Word("Aath","Eight"));
        words.add(new Word("Noo","Nine"));
        words.add(new Word("Dus","Ten"));



        customArrayAdapter Adapter = new customArrayAdapter(this, words);

        ListView listView= (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);

    }
}
