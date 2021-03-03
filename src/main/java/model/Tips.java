package model;

import com.sun.org.apache.xpath.internal.operations.String;

public class Tips {
    private int tipId;
    private String title;
    private String content;

    public Tips() {
    }

    public Tips(int tipId, String title, String content) {
        this.tipId = tipId;
        this.title = title;
        this.content = content;
    }

    public int getTipId() {
        return tipId;
    }

    public void setTipId(int tipId) {
        this.tipId = tipId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
