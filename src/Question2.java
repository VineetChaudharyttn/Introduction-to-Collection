/*Write a method that takes a string and returns the number of unique characters in the string.*/

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        String str;

        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int count=str.length();
        for (int i=0; i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count--;
                }
            }
        }
        System.out.println("Number if unque character"+count);
    }
}
