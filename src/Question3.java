/*Write a method that takes a string and print the number of occurrence of each character characters in the string.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string :");
        String str=sc.nextLine();
        map=checkOcc(str);
        System.out.println(map);

    }

    public static Map<Character, Integer> checkOcc(String str) {
        char ch;
        Map<Character,Integer> map=new HashMap<>();
        for(int i =0; i<str.length();i++){
            ch=str.charAt(0);
            if (ch!=' ') {
               if (map.containsKey(ch)) {
                   map.put(ch,map.get(ch)+1);                  
               }
               else
                   map.put(ch,1);
            }
        }
        return map;
    }
}
