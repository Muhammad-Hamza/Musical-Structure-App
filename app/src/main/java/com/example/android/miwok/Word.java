package com.example.android.miwok;

/**
 * Created by hamza on 10/28/2016.
 */

public class Word {

    private String mUrduwords;
    private String mdefaultWords;
    private static final int NO_RESOURCE_ID = -1;
    private int mimageResID=NO_RESOURCE_ID;




    public Word(String urduwords,String defaultWords,int imageResId)
    {
        mUrduwords = urduwords;
        mdefaultWords=defaultWords;
        mimageResID=imageResId;
    }

    public Word(String urduwords,String defaultWords)
    {
        mUrduwords = urduwords;
        mdefaultWords = defaultWords;
    }


    public String getUrduwordsTranslation()
    {
        return mUrduwords;

    }

    public String getDefaultTranslation()
    {
        return mdefaultWords;

    }
    public int getimageResID()
    {
        return mimageResID;
    }

    public boolean hasImage()
    {
        return mimageResID != NO_RESOURCE_ID;

    }

    public void mediaplayerMethod(int songResid)
    {

    }

}
