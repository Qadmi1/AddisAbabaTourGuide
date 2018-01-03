package com.example.appty.addidababatourguide;

/**
 * Created by appty on 30/12/17.
 */


public class Place {
    private int imageResource;
    private int title;
    private int description;

    public Place(int ImageResource, int title, int description) {
        this.imageResource = ImageResource;
        this.title = title;
        this.description = description;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getTitle() {
        return title;
    }

    public int getDescription() {
        return description;
    }
}
