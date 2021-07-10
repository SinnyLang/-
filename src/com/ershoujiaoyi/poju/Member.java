package com.ershoujiaoyi.poju;

import java.sql.Date;

public class Member {
    private Integer Mid;
    private String Mname;
    private String Mphonenumber;
    private Date Mdate;


    public Integer getMid() {
        return Mid;
    }

    public void setMid(Integer mid) {
        Mid = mid;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }

    public String getMphonenumber() {
        return Mphonenumber;
    }

    public void setMphonenumber(String mphonenumber) {
        Mphonenumber = mphonenumber;
    }

    public Date getMdate() {
        return Mdate;
    }

    public void setMdate(Date mdate) {
        Mdate = mdate;
    }

    public Member() {
        super();
    }

    @Override
    public String toString() {
        return "Member{" +
                "Mid='" + Mid + '\'' +
                ", Mname='" + Mname + '\'' +
                ", Mphonenumber='" + Mphonenumber + '\'' +
                ", Mdate=" + Mdate +
                '}';
    }
}
