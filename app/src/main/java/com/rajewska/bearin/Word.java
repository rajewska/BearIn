package com.rajewska.bearin;

public class Word {
    /**
     * Location
     */
    private String mLocation;

    /**
     * Name of the place
     */
    private String mName;


    /**
     * Image resource ID for the location
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object
     */
    public Word(String location, String name, int urban) {
        mLocation = location;
        mName = name;
    }
    /**
     * Get the location
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the name of the place
     */
    public String getName() {
        return mName;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}





