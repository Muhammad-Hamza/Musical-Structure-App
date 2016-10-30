package com.example.android.miwok;

import android.graphics.Color;
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
    }

}
