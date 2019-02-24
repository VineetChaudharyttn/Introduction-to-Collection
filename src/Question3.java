/*Write a method that takes a string and print the number of occurrence of each character characters in the string.*/

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string :");
        String str=sc.nextLine();
        int count,flag;
        for(int i=0;i<str.length();i++){
            count=0;
            flag=0;
            for (int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
                if(i>j && str.charAt(i)==str.charAt(j))
                    flag=1;
            }
            if(flag==0)
                System.out.println("occurrence of "+str.charAt(i)+" is "+count);
        }
    }
}
