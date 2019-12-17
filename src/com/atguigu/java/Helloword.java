package com.atguigu.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Helloword {
    public static void main(String[] args) {
        System.out.println("helloword");
        System.out.print("hello");
        ArrayList<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("zhangsan2");
        list.add("zhangsan3");
        list.add("zhangsan4");
        System.out.println(list);
        Map<Integer, String> map = new HashMap<>();
        map.put(12, "zhangsan");
        map.put(17, "lisi");
        map.containsKey(10);
        boolean flag = map.isEmpty();
        for (String value : map.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String> me : map.entrySet()) {
            System.out.println(me.getKey());
            int i = me.getKey();
            System.out.println(i);
        }

        Helloword helloword=new Helloword();
        helloword.find();
    }
    public void find(){
        //这是单行注释
        System.out.println("你好");

}

}
