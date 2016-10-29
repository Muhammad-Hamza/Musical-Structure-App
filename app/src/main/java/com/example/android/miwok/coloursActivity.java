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


public class coloursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words);


        ArrayList<Word> colourWords = new ArrayList<Word>();


        colourWords.add(new Word("Lal", "Red"));
        colourWords.add(new Word("Hara", "Green"));
        colourWords.add(new Word("Kathai", "Brown"));
        colourWords.add(new Word("Surmai", "Gray"));
        colourWords.add(new Word("kala", "Black"));
        colourWords.add(new Word("sufaid", "White"));
        colourWords.add(new Word("dhoolzard", "Dust Yellow"));
        colourWords.add(new Word("peele sarsu", "Mustard Yellow"));


        customArrayAdapter colourArray = new customArrayAdapter(this, colourWords);


        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(colourArray);
    }

}
