package com.ershoujiaoyi.poju;

import java.sql.Date;

public class WuPin {
    private Integer Wid;
    private String Wkind;
    private String Wdescribe;
    private Double Wprice;
    private Date Wdate;
    private String Winformation;
    private String Wstate;
    private Integer Aid;
    private Integer Mid;

    public Integer getWid() {
        return Wid;
    }

    public void setWid(Integer wid) {
        Wid = wid;
    }

    public String getWkind() {
        return Wkind;
    }

    public void setWkind(String wkind) {
        Wkind = wkind;
    }

    public String getWdescribe() {
        return Wdescribe;
    }

    public void setWdescribe(String wdescribe) {
        Wdescribe = wdescribe;
    }

    public Double getWprice() {
        return Wprice;
    }

    public void setWprice(Double wprice) {
        Wprice = wprice;
    }

    public Date getWdate() {
        return Wdate;
    }

    public void setWdate(Date wdate) {
        Wdate = wdate;
    }

    public String getWinformation() {
        return Winformation;
    }

    public void setWinformation(String winfomation) {
        Winformation = winfomation;
    }

    public String getWstate() {
        return Wstate;
    }

    public void setWstate(String wstate) {
        Wstate = wstate;
    }

    public Integer getAid() {
        return Aid;
    }

    public void setAid(Integer aid) {
        Aid = aid;
    }

    public Integer getMid() {
        return Mid;
    }

    public void setMid(Integer mid) {
        Mid = mid;
    }

    public WuPin() {
        super();
    }

    @Override
    public String toString() {
        return "WuPin{" +
                "Wid=" + Wid +
                ", Wkind='" + Wkind + '\'' +
                ", Wdescribe='" + Wdescribe + '\'' +
                ", Wprice=" + Wprice +
                ", Wdate=" + Wdate +
                ", Winfomation='" + Winformation + '\'' +
                ", Wstate=" + Wstate +
                ", Aid=" + Aid +
                ", Mid=" + Mid +
                '}';
    }
}