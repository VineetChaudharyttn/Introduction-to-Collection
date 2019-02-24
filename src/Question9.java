/*Write a program to display times in different country format.*/

import java.text.DateFormat;
import java.util.*;

public class Question9 {

    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());

        Locale locItalian = new Locale("it","ch");
        DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, locItalian);
        System.out.println("today is in Italian Language  in Switzerland Format : "+ df.format(d1));

        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String PST = df.format(d1);
        System.out.println("Date in PST Timezone Los Angeles: " + PST);

    }

}
