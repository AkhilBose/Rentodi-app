package com.Byteinfotech.atto.attendance;

public class ScreenItem {

    String Title,Description;
    String ScreenImg;
    String Des;

    public ScreenItem(String title,String des, String screenImg) {
        Title = title;
        ScreenImg = screenImg;
        Des = des;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setScreenImg(String screenImg) {
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getScreenImg() {
        return ScreenImg;
    }
}
