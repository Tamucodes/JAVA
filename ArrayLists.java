import java.util.*;

public class ArrayLists{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements 
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println("ArrayList: " + list);

        //get 
        int element = list.get(2);
        System.out.println("Element at index 2: " + element);
        // to add inbetween 
        list.add(1,2); // index, value
        System.out.println(list);
        // set element
        list.set(1,4); // index, value 
        System.out.println(list);

        //delete element
        list.remove(2); //index
        System.out.println("After removing element at index 2: " + list);

        //size of the arraylist
        int size = list.size();
        System.out.println(size);

        //looping through arraylist
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sorting in ArrayList
        Collections.sort(list);
    }
}