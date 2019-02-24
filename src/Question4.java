/*Write a program to sort Employee objects based on highest salary using Comparator.
Employee class{ Double Age; Double Salary; String Name*/

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        List<Employee> object=new ArrayList<>();
        Employee employee=new Employee(24d,50000d,"Vishal");
        Employee employee1=new Employee(22d,45000d,"Anuj");
        Employee employee2=new Employee(20d,55000d,"Richa");
        Employee employee3=new Employee(23d,60000d,"Vineet");

        object.add(employee);
        object.add(employee1);
        object.add(employee2);
        object.add(employee3);

        object.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.salary<o2.salary) {
                   return -1;
                }
                else
                    return 0;
            }
        });
        Employee obj;

        Iterator<Employee> employeeIterator=object.listIterator();
        while (employeeIterator.hasNext()){
            obj=employeeIterator.next();
            System.out.println("Name :"+obj.name+" Age:"+obj.age+" Salary:"+obj.salary);
        }
    }
}
