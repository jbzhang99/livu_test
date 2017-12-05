package com.rcplatform.videochat.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "rc_language")
@ApiModel
public class Language implements Serializable {

    public Language() {
    }

    public Language(String languageAb) {
        this.languageAb = languageAb;
    }

    @Id
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 语言缩写
     */
    @Column(name = "language_ab")
    @ApiModelProperty(value="语言缩写")
    private String languageAb;

    @Column(name = "language_name")
    @ApiModelProperty(value="")
    private String languageName;

    @Column(name = "language_country")
    @ApiModelProperty(value="")
    private String languageCountry;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取语言缩写
     *
     * @return language_ab - 语言缩写
     */
    public String getLanguageAb() {
        return languageAb;
    }

    /**
     * 设置语言缩写
     *
     * @param languageAb 语言缩写
     */
    public void setLanguageAb(String languageAb) {
        this.languageAb = languageAb;
    }

    /**
     * @return language_name
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * @param languageName
     */
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    /**
     * @return language_country
     */
    public String getLanguageCountry() {
        return languageCountry;
    }

    /**
     * @param languageCountry
     */
    public void setLanguageCountry(String languageCountry) {
        this.languageCountry = languageCountry;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", languageAb=").append(languageAb);
        sb.append(", languageName=").append(languageName);
        sb.append(", languageCountry=").append(languageCountry);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}