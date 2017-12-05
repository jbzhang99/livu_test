package com.rcplatform.livechat.dto.response;

import com.rcplatform.videochat.model.Consume;
import com.rcplatform.videochat.model.Country;
import com.rcplatform.videochat.model.FreeCommodity;
import com.rcplatform.videochat.model.Language;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2017/3/27.
 */
public class OldBaseInfoDto implements Serializable{


    private List<Consume> consumeList;

    private List<Country> countryList;


    private List<Language> languageList;


    private List<FreeCommodity> freeCommodityList;


    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    public List<Consume> getConsumeList() {
        return consumeList;
    }

    public void setConsumeList(List<Consume> consumeList) {
        this.consumeList = consumeList;
    }

    public List<Language> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<Language> languageList) {
        this.languageList = languageList;
    }


    public List<FreeCommodity> getFreeCommodityList() {
        return freeCommodityList;
    }

    public void setFreeCommodityList(List<FreeCommodity> freeCommodityList) {
        this.freeCommodityList = freeCommodityList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseInfoDto{");
        sb.append("consumeList=").append(consumeList);
        sb.append(", countryList=").append(countryList);
        sb.append(", languageList=").append(languageList);
        sb.append(", freeCommodityList=").append(freeCommodityList);
        sb.append('}');
        return sb.toString();
    }
}
