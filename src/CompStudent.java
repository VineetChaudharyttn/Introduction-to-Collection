import java.util.Comparator;

public class CompStudent implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int compareValue=o1.score.compareTo(o2.score);
        if(compareValue==0){
            compareValue=o1.name.compareTo(o2.name);
        }
        return compareValue;
    }
}
