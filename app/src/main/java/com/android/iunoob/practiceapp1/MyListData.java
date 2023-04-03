package com.android.iunoob.practiceapp1;

public class MyListData {
    private String title;

    private String size;
    private String quality;
    private String duration;

    private int imgId;

    public MyListData(int imgId, String title, String size, String quality, String duration) {
        this.title = title;
        this.imgId = imgId;
        this.size = size;
        this.duration = duration;
        this.quality = quality;
    }

    public String gettitle() {
        return title;
    }

    public int getImgId() {
        return imgId;
    }

    public String getSize() {
        return size;
    }

    public String getQuality() {
        return quality;
    }

    public String getDuration() {
        return duration;
    }
}
