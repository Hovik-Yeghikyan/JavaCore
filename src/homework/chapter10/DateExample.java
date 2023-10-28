package homework.chapter10;

import homework1.medicalCenter.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(DateUtil.dateTimeToString(date));


    }
}
