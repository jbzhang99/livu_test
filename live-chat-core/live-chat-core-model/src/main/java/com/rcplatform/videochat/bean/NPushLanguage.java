package com.rcplatform.videochat.bean;

/**
 * Created by yaoyuan on 2017/6/21.
 */
public class NPushLanguage {

    public NPushLanguage() {
    }

    public NPushLanguage(Integer languageId, String title, String content) {
        this.languageId = languageId;
        this.title = title;
        this.content = content;
    }

    private Integer languageId;

    private String title;

    private String content;

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
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
