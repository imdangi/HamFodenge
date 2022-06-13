package JavaTrainingAssignments.Day5.Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);

        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            System.out.println("Value = "+it.next());
        }
        for(Integer element:arr){
            System.out.println(element);
        }
    }
}
