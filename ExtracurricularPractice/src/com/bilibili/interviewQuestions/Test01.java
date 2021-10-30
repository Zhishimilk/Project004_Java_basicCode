package com.bilibili.interviewQuestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            Date d = sdf.parse("2016-06-05");
            System.out.println(d);
            c.setTime(d);
            System.out.println(c.get(Calendar.DAY_OF_WEEK));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
