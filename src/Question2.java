/*Write a method that takes a string and returns the number of unique characters in the string.*/

import java.util.HashSet;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        String str;
        int count;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        count=checkUniqueNumber(str);
        System.out.println("Number if unque character"+count);
    }

    public static int checkUniqueNumber(String str) {
        HashSet<Character> set=new HashSet<>();
        for (int i=0; i<str.length();i++){
            set.add(str.charAt(i));
        }
        return set.size();
    }
}
