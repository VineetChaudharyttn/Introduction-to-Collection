/*Write Java code to define List . Insert 5 floating point numbers in List,
and using an iterator, find the sum of the numbers in List.*/

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Float sum=new Float(0.0);
        List<Float> list=new ArrayList<>();
        list.add(1.1f);
        list.add(2.2f);
        list.add(3.3f);
        list.add(4.4f);
        list.add(5.5f);
        ListIterator<Float> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            sum+=listIterator.next();
        }
        System.out.println("Sum ="+sum);
    }
}
