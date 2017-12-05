package com.rcplatform.livechat.bean;

/**
 * Created by admin on 2017/4/14.
 */
public class MatchTemp {


    public MatchTemp(Integer matchUserId, String ident) {
        this.matchUserId = matchUserId;
        this.ident = ident;
    }

    public MatchTemp() {
    }

    private Integer matchUserId;


    private String ident;


    public Integer getMatchUserId() {
        return matchUserId;
    }

    public void setMatchUserId(Integer matchUserId) {
        this.matchUserId = matchUserId;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MatchTemp{");
        sb.append("matchUserId=").append(matchUserId);
        sb.append(", ident='").append(ident).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
