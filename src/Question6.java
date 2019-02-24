/*Print the elements of an array in the decreasing frequency if 2 numbers have
same frequency then print the one which came first.*/

import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers of list:");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());
        arrayList.add(sc.nextInt());

        Map<Integer,Integer> arrayIndex=new HashMap<>();
        Integer count=0;
        Integer value,flag,j;

        arrayIndex.put(0,1);
        for(int i =1; i<arrayList.size();i++){
            value=0;
            flag=0;
            for ( Integer key : arrayIndex.keySet() ) {
                    if(arrayList.get(key)==arrayList.get(i)){
                    value=arrayIndex.get(key);
                    arrayIndex.put(key,++value);
                    flag=1;
                }
            }
            if(flag==0){
                arrayIndex.put(i,1);
            }
        }


        List<Map.Entry<Integer,Integer>> list=new LinkedList<Map.Entry<Integer, Integer>>(arrayIndex.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {

                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<Integer,Integer> entry:list
             ) {
                System.out.println("Element"+arrayList.get(entry.getKey())+"frequency"+entry.getValue());
        }
    }
}
