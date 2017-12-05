package com.rcplatform.livechat.dto.request;

import java.io.Serializable;

/**
 * Created by yang peng on 2016/8/8.
 */

public class UserLanguageDto implements Serializable {

    public UserLanguageDto(String languageName, Integer languageId) {
        this.languageName = languageName;
        this.languageId = languageId;
    }

    public UserLanguageDto() {
    }

    /**
     * 语言id
     */
    private Integer languageId;

    /**
     * 语言名称
     */

    private String languageName;


    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}
