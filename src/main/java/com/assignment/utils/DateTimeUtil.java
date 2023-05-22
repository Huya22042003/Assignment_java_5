package com.assignment.utils;

import java.sql.Timestamp;

public class DateTimeUtil {
    public static Long convertDateToTimeStampSecond() {
        // lấy thời gian hiện tại
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

}
