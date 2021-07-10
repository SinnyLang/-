package com.ershoujiaoyi.poju;

import java.sql.Date;

public class Order {
    private Integer Ono;
    private Integer Onumber;
    private Date Oredate;
    private String Wid;

    public Integer getOno() {
        return Ono;
    }

    public void setOno(Integer ono) {
        Ono = ono;
    }

    public Integer getOnumber() {
        return Onumber;
    }

    public void setOnumber(Integer onumber) {
        Onumber = onumber;
    }

    public Date getOredate() {
        return Oredate;
    }

    public void setOredate(Date odate) {
        Oredate = odate;
    }

    public String getWid() {
        return Wid;
    }

    public void setWid(String wid) {
        Wid = wid;
    }

    public String getMid() {
        return Mid;
    }

    public void setMid(String mid) {
        Mid = mid;
    }

    private String Mid;

    public Order() {
        super();
    }

    @Override
    public String toString() {
        return "Order{" +
                "Ono=" + Ono +
                ", Onumber=" + Onumber +
                ", Odate=" + Oredate +
                ", Wid='" + Wid + '\'' +
                ", Mid='" + Mid + '\'' +
                '}';
    }
}
