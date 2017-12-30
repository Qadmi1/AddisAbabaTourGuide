package com.example.appty.addidababatourguide;

/**
 * Created by appty on 30/12/17.
 */


public class Place {
    private int mImageResource;
    private int mTitle;
    private int mDiscription;

    public Place(int mImageResource, int mTitle, int mDiscription) {
        this.mImageResource = mImageResource;
        this.mTitle = mTitle;
        this.mDiscription = mDiscription;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public int getmTitle() {
        return mTitle;
    }

    public int getmDiscription() {
        return mDiscription;
    }
}
