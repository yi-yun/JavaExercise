package com.yiyun.usually.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日");
        Date d=new Date(1233234235234L);
        String str=df.format(d);
        System.out.println(str);

        System.out.println("###############");

        String s="2019-1-14 16:35:43";
        DateFormat date=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date1=date.parse(s);
        System.out.println("date1 = " + date1);
    }
}
