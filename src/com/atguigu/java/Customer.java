package com.atguigu.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * @author wall
 * @data 2019/12/16 - 13:00
 */
/*
快捷键的使用
 */
public class Customer {
    public static void main(String[] args) {
        System.out.println("helloword");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Customer.main");
        int i=10;
        System.out.println("i = " + i);
        String[] arr=new String[]{"lilei","zhangsan","lisi"};
        for (int j = 0; j <arr.length ; j++) {
            System.out.println("arr = " + arr[j]);

        }
        for (String s : arr) {
            System.out.println(s);

        }
        HashSet<String> strings = new HashSet<>();
        strings.add("zhangs");
        strings.add("lisi");
        strings.add("wangwu");
        for (String string : strings) {
            System.out.println(string);
        }
        ArrayList<Object> list = new ArrayList<>();
        boolean flag = list.isEmpty();
        list.add("zhangs");
        list.add("lisi");

       if(list!=null){
           System.out.println(list.size()+"...."+flag);

       }
        TreeMap<Object, Object> map = new TreeMap<>();
        Object zhangsan = map.put(1, "zhangsan");


    }
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public static final int NUM=1;
    public static final String NATION="CHAIN";





}
