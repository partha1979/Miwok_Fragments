package com.example.android.miwok;

/**
 * Created by parthachakraborty on 09/11/17.
 */

public class Word {


    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word (String miwokTranslation, String defaultTranslation, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word (String miwokTranslation, String defaultTranslation, int imageId, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageId = imageId;
        mAudioResourceId = audioResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getmImageId() { return  mImageId;}

    public boolean hasImage () {
        return mImageId != NO_IMAGE_PROVIDED;
    }
    public int getmAudioResourceId () { return mAudioResourceId;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageId=" + mImageId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
