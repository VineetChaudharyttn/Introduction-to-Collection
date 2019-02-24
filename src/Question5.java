/*Write a program to sort the Student objects based on Score ,
if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        Student st1=new Student("Richa",40d,20d);
        Student st4=new Student("Vishal",45d,29d);
        Student st2=new Student("Anuj",40d,23d);
        Student st=new Student("Vineet",50d,22d);
        Student st3=new Student("Ashish",42d,25d);
        students.add(st);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        CompStudent comp=new CompStudent();
        students.sort(comp);
        Student obj;
        Iterator<Student> employeeIterator=students.listIterator();
        while (employeeIterator.hasNext()){
            obj=employeeIterator.next();
            System.out.println("Name :"+obj.name+" Age:"+obj.age+" Salary:"+obj.score);
        }
    }
}
