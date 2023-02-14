package com.wy;


import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Weather {
    public static void main(String[] args) {
        String url = "https://api.seniverse.com/v3/weather/now.json?key=SV44O7Y6pg0VrZH_p&location=chengdu&language=zh-Hans&unit=c";
        //这个属于发起请求并获取json数据（得引入hutool，即上面引入的第二个依赖）
        String json= HttpUtil.createGet(url).execute().body();
        //转化请求的 json 数据
        JSONObject jsonResult = JSONObject.parseObject(json);
        //获取 results 数组
        JSONArray results = jsonResult.getJSONArray("results");
        int size = results.size();
        System.out.println("size: "+size);
        JSONObject json_result = results.getJSONObject(0);
        int size1 = json_result.size();
        System.out.println( "result 大小:  "+size1);
        JSONObject json_location = json_result.getJSONObject("location");
        int size2 = json_location.size();
        JSONArray location = json_location.getJSONArray("location");
        for (int i = 0; i < json_location.size(); i++) {
            System.out.println(location.getJSONObject(i));
        }
        JSONObject jsonObject = location.getJSONObject(0);
        System.out.println(jsonObject.getString("id"));
        System.out.println("location size : " + size2);
        //String location = json_result.getString("location");
        String id = json_location.getString("id");
        System.out.println(id);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        JSONObject now_json = json_result.getJSONObject("now");
        String text = now_json.getString("text");
        System.out.println(text);
       /* System.out.println("~~~~~~~~~~~~");
        System.out.println(json_result);
        System.out.println("~~~~~~~~~~~~");
        String now = json_result.getString("now");
        System.out.println(now);
        System.out.println("~~~~~~~~~~~~");
        String lastUpdate = json_result.getString("last_update");
        System.out.println(lastUpdate);*/
    }
}
