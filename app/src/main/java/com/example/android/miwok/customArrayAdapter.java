package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hamza on 10/29/2016.
 */

public class customArrayAdapter extends ArrayAdapter<Word> {


    public customArrayAdapter(Activity context, ArrayList<Word> Word) {
        super(context, 0, Word);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
      if(listItemView == null )
      {
          listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);

      }

        Word currentWordPosition = getItem(position);

        TextView mivokText = (TextView) listItemView.findViewById(R.id.miwokText);
        mivokText.setText(currentWordPosition.getUrduwordsTranslation());


        TextView defaultText = (TextView) listItemView.findViewById(R.id.defaultText);
        defaultText.setText(currentWordPosition.getDefaultTranslation());

        ImageView image = (ImageView) listItemView.findViewById(R.id.imageResource);

        if(currentWordPosition.hasImage())
        {
            image.setImageResource(currentWordPosition.getimageResID());
        }
        else {
            image.setVisibility(View.GONE);
        }



        return listItemView;

}}