package com.qingcheng.controller.goods;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class a {
    public static void main(String[] args) {

c();
    }

    public static void b(){
        String str = "2019‐01‐26";
        //指定转换格式
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //进行转换
        LocalDate date = LocalDate.parse(str, fmt);

        System.out.println("date:"+date);
    }

    public static void c(){
        String str = "2019-01-26";
        //指定转换格式
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //进行转换
        LocalDate date = LocalDate.parse(str, fmt);

        System.out.println("date:"+date);
    }
}
