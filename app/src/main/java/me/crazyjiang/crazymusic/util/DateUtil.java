/**
 * File Name:DateUtil.java
 * Package Name:com.zzkko.util
 * author:yangxiongjie
 * Date:2014-1-18上午9:59:24
 * Copyright (c) 2014, zzkko All Rights Reserved.
 */
package me.crazyjiang.crazymusic.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 日期工具类
 * MM/dd/yyyy HH:mm:ss
 */
public class DateUtil {
    public static String getYesterday() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();// 此时打印它获取的是系统当前时间
        calendar.add(Calendar.DATE, -1); // 得到前一天
        String tomorrow = format.format(calendar.getTime());
        return tomorrow;
    }

    public static String getToday(String dateFormat) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        String date = format.format(new Date(System.currentTimeMillis()));
        return date;
    }

    public static String getCurrentDateTime() {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String date = format.format(new Date(System.currentTimeMillis()));
        return date;
    }

    public static String getTomorrow(String dateFormat) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        Calendar calendar = Calendar.getInstance();// 此时打印它获取的是系统当前时间
        calendar.add(Calendar.DATE, +1); // 得到前一天
        String tomorrow = format.format(calendar.getTime());
        return tomorrow;
    }

    public static String getTime24(long times) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        return format.format(new Date(times));
    }

    public static String getDate(long time) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(time);
    }

    public static Date getDate(String date, String dateFormat) {
        DateFormat format = new SimpleDateFormat(dateFormat, Locale.getDefault());
        try {
            return format.parse(date);
        } catch (ParseException e) {
            Logger.e("", e);
            return null;
        }
    }

    public static String getDate(Date date, String dateFormat) {
        DateFormat format = new SimpleDateFormat(dateFormat, Locale.getDefault());
        return format.format(date);
    }

    public static String getDate(String dateFormat, long currenttimemillis) {
        return new SimpleDateFormat(dateFormat, Locale.getDefault()).format(currenttimemillis);
    }

    public static String getMessageTime(long sendTime) {
        if (getToday("yyyy-MM-dd").equals(getDate(sendTime))) {
            return "Today " + getDate("HH:mm a", sendTime);
        } else if (getYesterday().equals(getDate(sendTime))) {
            return "Yesterday " + getDate("HH:mm a", sendTime);
        } else {
            return getDate("yyyy-MM-dd HH:mm a", sendTime);
        }
    }

    public static String getNewFormat(String time, String oldFormat, String newFormat) {
        try {
            DateFormat writeFormat = new SimpleDateFormat(newFormat, Locale.getDefault());
            DateFormat readFormat = new SimpleDateFormat(oldFormat, Locale.getDefault());

            Date date = readFormat.parse(time);
            return writeFormat.format(date); // Find formatted date
        } catch (ParseException e) {
            Logger.e("", e);
            return "";
        }
    }
}
