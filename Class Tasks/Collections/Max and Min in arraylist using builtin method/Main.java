import java.util.*;
public class Main{
public static void main(String args[]){
ArrayList<Integer> arr = new ArrayList<>();
arr.add(7);
arr.add(4);
arr.add(10);
arr.add(20);
arr.add(5);
arr.add(2);
Integer max=Collections.max(arr);
System.out.println("Maximum element: "+max);
Integer min=Collections.min(arr);
System.out.println("Minimum element: "+min);
}
}