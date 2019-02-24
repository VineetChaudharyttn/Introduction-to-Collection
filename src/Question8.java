/*Write a program to format date as example "21-March-2016"*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Question8 {

    public static void main(String[] args) {

        Calendar calendar=Calendar.
                getInstance();

        calendar.setTime(new Date());
        calendar.set(2016,02,21,0,0,0);
        Date dd=calendar.getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMMM-yyyy");
        System.out.println(simpleDateFormat.format(dd));
    }
}
