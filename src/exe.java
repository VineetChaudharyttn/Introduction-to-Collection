import java.util.LinkedList;
import java.util.ListIterator;

public class exe extends Person {
    int empId;

    public exe(int age, String name,int empId) {
        super(age, name);
        this.empId=empId;
    }

    public static void main(String[] args) {
        LinkedList<exe> presonList=new LinkedList<>();
        
        exe obj=new exe(20,"vineet",1);
        exe obj1=new exe(29,"vishal",2);
        exe obj2=new exe(20,"reshma",3);
        
        presonList.add(obj);
        presonList.add(obj1);
        presonList.add(obj2);
        ListIterator<exe> listIterator= presonList.listIterator();
        while (listIterator.hasNext()){
            exe ex=listIterator.next();
            System.out.println("AGE:"+ex.age+" name:"+ex.name+" empid:"+ex.empId);
        }
    }
}

class Person{
    int age;
    String name;

    public Person(int age,String name) {
        this.age=age;
        this.name=name;
    }
}
