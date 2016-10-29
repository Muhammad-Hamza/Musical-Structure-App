package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class numberActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_activiy);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Lutti","One"));
        words.add(new Word("otiiko","Two"));
        words.add(new Word("tolookosu","Three"));
        words.add(new Word("oyyisa","Four"));
        words.add(new Word("massokka","Five"));
        words.add(new Word("temmoka","Six"));
        words.add(new Word("kenekaku","Seven"));
        words.add(new Word("kawinta","Eight"));
        words.add(new Word("wo'e","Nine"));
        words.add(new Word("na'aacha","Ten"));



        customArrayAdapter Adapter = new customArrayAdapter(this, words);

        ListView listView= (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);

    }
}
