package com.wy;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateStudy {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        Date date1 = new Date();
        date1.setTime(time);
        System.out.println(date1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EEE a");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒 EEE a");
        Date parse = sdf.parse("2023-02-13 16时37分38秒 星期一 下午");
        String format1 = sdf.format(parse);
        System.out.println(format1);
        Random random = new Random();
        int i = random.nextInt(9);
        System.out.println(i);
    }

    @Test
    public void Calender(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
