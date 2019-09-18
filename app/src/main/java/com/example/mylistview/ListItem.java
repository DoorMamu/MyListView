package com.example.mylistview;
//create a encpsulation class to create ListItem object
public class ListItem {
    private String title;
    private String desc;
    private int img_res;
    public ListItem(String title,String desc,int img_res)
    {
        this.desc=desc;
        this.img_res=img_res;
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }
}
