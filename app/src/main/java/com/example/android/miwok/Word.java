package com.example.android.miwok;

/**
 * Created by hamza on 10/28/2016.
 */

public class Word {

    private String mMivokwords;
    private String mdefaultWords;

    public Word(String mivokwords,String defaultWords)
    {
        mMivokwords=mivokwords;
        mdefaultWords=defaultWords;
    }


    public String getmivokTranslation()
    {
        return mMivokwords;

    }

    public String getDefaultTranslation()
    {
        return mdefaultWords;

    }

}
