import java.util.*;
public class Main{
public static void main(String args[]){
ArrayList<String> arr = new ArrayList<>();
arr.add("First");
arr.add("Second");
arr.add("Third");
arr.add("Fourth");
arr.add("Fifth");
arr.add("Sixth");
System.out.println("Original array: "+arr);
arr.remove(4);
System.out.println("Array after removing fifth element: "+arr);
}
}