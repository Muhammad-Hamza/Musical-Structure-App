package com.example.android.miwok;

/**
 * Created by hamza on 10/28/2016.
 */

public class Word {

    private String mMivokwords;
    private String mdefaultWords;
    private int mimageResID;


    public Word(String mivokwords,String defaultWords,int imageResId)
    {
        mMivokwords=mivokwords;
        mdefaultWords=defaultWords;
        mimageResID=imageResId;
    }


    public String getmivokTranslation()
    {
        return mMivokwords;

    }

    public String getDefaultTranslation()
    {
        return mdefaultWords;

    }
    public int getimageResID()
    {
        return mimageResID;
    }

}
