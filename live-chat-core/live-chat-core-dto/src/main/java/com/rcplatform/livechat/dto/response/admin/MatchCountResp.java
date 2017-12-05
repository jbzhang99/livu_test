package com.rcplatform.livechat.dto.response.admin;

/**
 * Created by Yang Peng on 2017/6/9.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
public class MatchCountResp {


    private Integer totalMatchCount;


    private Integer todayMatchCount;


    private Integer yesterdayMatchCount;


    private Integer matchGold;


    private Integer giftGold;


    public MatchCountResp() {
    }

    public MatchCountResp(Integer totalMatchCount, Integer todayMatchCount, Integer yesterdayMatchCount, Integer matchGold, Integer giftGold) {
        this.totalMatchCount = totalMatchCount;
        this.todayMatchCount = todayMatchCount;
        this.yesterdayMatchCount = yesterdayMatchCount;
        this.matchGold = matchGold;
        this.giftGold = giftGold;
    }

    public Integer getTotalMatchCount() {
        return totalMatchCount;
    }

    public void setTotalMatchCount(Integer totalMatchCount) {
        this.totalMatchCount = totalMatchCount;
    }

    public Integer getTodayMatchCount() {
        return todayMatchCount;
    }

    public void setTodayMatchCount(Integer todayMatchCount) {
        this.todayMatchCount = todayMatchCount;
    }

    public Integer getYesterdayMatchCount() {
        return yesterdayMatchCount;
    }

    public void setYesterdayMatchCount(Integer yesterdayMatchCount) {
        this.yesterdayMatchCount = yesterdayMatchCount;
    }

    public Integer getMatchGold() {
        return matchGold;
    }

    public void setMatchGold(Integer matchGold) {
        this.matchGold = matchGold;
    }

    public Integer getGiftGold() {
        return giftGold;
    }

    public void setGiftGold(Integer giftGold) {
        this.giftGold = giftGold;
    }


}
