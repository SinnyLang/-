package com.ershoujiaoyi.utils;

import net.sf.json.JSONArray;

import java.util.List;

public class List2Json1 {
    public static JSONArray List2Json(List list){
        JSONArray json = JSONArray.fromObject(list);
        return json;
    }
}
