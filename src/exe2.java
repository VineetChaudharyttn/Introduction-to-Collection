import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class exe2 {

    public static void main(String[] args) {
/*
        Date date= new Date();
        SimpleDateFormat f=new SimpleDateFormat("dd.MM.yyy");
        System.out.println(f.format(date));
        System.out.println(date.getDate()+"-"+date.getMonth()+"-"+date.getYear());*/

        Calendar calendar=Calendar.
                getInstance();
        
        calendar.setTime(new Date());
        calendar.set(2017,10,22,3,40,50);
        Date dd=calendar.getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-yyyy-MM");
        System.out.println(simpleDateFormat.format(dd));
        simpleDateFormat=new SimpleDateFormat("hh:mm:ss");
        System.out.println(simpleDateFormat.format(dd));
     }
}
