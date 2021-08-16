package com.thestrikem.DateExamples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StrikeDate {
    public static void main(String[] args) {
        Calendar calendar = StrikeDate.getTodayDate();
//        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        String uniqueDateFormat = StrikeDate.getUniqueDateFormat(calendar.getTime(), "dd/MM/yyyy HH:mm:ss");
        System.out.println(uniqueDateFormat);
    }

    public static Calendar getTodayDate() {
        Calendar calendar = Calendar.getInstance();
        return calendar;
    }

    public static String getUniqueDateFormat(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(date);
    }

    public static String getUniqueDateFormat(Date date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
}
