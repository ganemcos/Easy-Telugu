package com.example.agnisai.miwok;

/**
 * Created by Acer on 21-12-2017.
 */

public class subList {
    /**
     * Created by Acer on 21-12-2017.
     */
    private String mTeluguword;
    private String mDefaultword;
    private int imageresorce = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1;
    private int mAudioResourseId;



    public subList(String defaultword, String teluguword,int audioResourseId) {
        mTeluguword = teluguword;
        mDefaultword = defaultword;
        mAudioResourseId = audioResourseId;
    }

    public subList(String defaultword, String teluguword, int Imageresorce, int audioResourseId) {
        mTeluguword = teluguword;
        mDefaultword = defaultword;
        imageresorce = Imageresorce;
        mAudioResourseId = audioResourseId;
    }

    public String getTeluguword() {
        return mTeluguword;
    }

    public String getDefaultword() {
        return mDefaultword;
    }

    public int getmAudioResourseId(){ return mAudioResourseId; }

    public int getImageresorce() {
        return imageresorce;
    }
    /**
     * Return eh
     * @return
     */
    public boolean hasImage() {
        return imageresorce!=NO_IMAGE_PROVIDED;
    }
}
