package com.ershoujiaoyi.poju;

public class Admin {
    private String Aid;

    public Admin() {
        super();
    }

    public String getAid() {
        return Aid;
    }

    public void setAid(String aid) {
        Aid = aid;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "Aid='" + Aid + '\'' +
                '}';
    }
}
