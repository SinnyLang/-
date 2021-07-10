package com.ershoujiaoyi.utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonObjectArrayTest {
    public static void main(String[] args) {
        // 1.从字符串转换成JSONArray对象，必须首尾为[,]; 工具代码会判断是否含有'['和']'
        String types1 = "[\"locality\",\"political\"]";
        JSONArray jsonArray1 = JSONArray.fromObject(types1);
        System.out.println(jsonArray1.toString());
        // 2.从一个JSONArray转换成另一个JSONArray对象
        JSONArray jsonArray2 = JSONArray.fromObject(jsonArray1);
        System.out.println(jsonArray2.toString());
        // 3.将Collection对象, 本例为ArrayList转换成JSONArray对象
        List<String> types3 = new ArrayList<String>();
        types3.add("locality");
        types3.add("political");
        JSONArray jsonArray3 = JSONArray.fromObject(types3);
        System.out.println(jsonArray3.toString());
        // 4. new 一个JSONObject对象，使用put方法添加成员，如果已经存在key, 则替换value值
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("types", jsonArray3);
        System.out.println(jsonObject1.toString());
        // 5.将一个JSONObject对象转换成另一个JSONObject对象
        JSONObject jsonObject2 = JSONObject.fromObject(jsonObject1);
        System.out.println(jsonObject2);
        // 6.将一Map对象转换成JSONObject对象
        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("locality");
        list.add("political");
        map.put("types", list);
        JSONObject jsonObject3 = JSONObject.fromObject(map);
        System.out.println(jsonObject3);
        // 7.将String转换成JSONObject对象
        String str1 = "{\"types\":[\"locality\",\"political\"]}";
        JSONObject jsonObject4 = JSONObject.fromObject(str1);
        System.out.println(jsonObject4);
        // 8.累积value到这个key下,这个key下value变成JSONArray， 如果value本身就是JSONArray,直接添加到里面
        JSONObject jsonObject5 = jsonObject4.accumulate("place_id", "ChIJuSwU55ZS8DURiqkPryBWYrk");
        System.out.println(jsonObject5.toString());
        JSONObject jsonObject6 = jsonObject5.accumulate("place_id", "accumulate");
        System.out.println(jsonObject5.toString());
        System.out.println(jsonObject6);
        // 9.element将键值对放到JSONObject中, 如果key存在，则替换原来的value;
        // element与put的区别: 1.put返回的Object对象； element返回的是JSONObject对象
        // 2.put的key为Object对象，element的key为String
        JSONObject jsonObject7 = jsonObject6.element("types", 1);
        System.out.println(jsonObject7.toString());
        // 10.使用get方法，获取成员
        System.out.println(jsonObject7.getInt("types"));
        System.out.println(jsonObject7.getJSONArray("place_id"));
        System.out.println(jsonObject7.getJSONArray("place_id").get(1));
    }
}
