/*Write a Java program that sorts the entries of a HashMap based on their values.
Initialize a HashMap with string keys and integer values. 
Sort the entries based on values in ascending order and print the sorted entries.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Map<String,Integer> map1 = new HashMap<>();
	    map1.put("A",7);
	    map1.put("B",5);
	    map1.put("C",3);
	    map1.put("D",10);
	    List<Integer> list1 = new ArrayList<>();
	    for(Map.Entry<String,Integer> map2:map1.entrySet()){
	     list1.add(map2.getValue());
	    }
	    Collections.sort(list1);
	    Map<String,Integer> map3 = new LinkedHashMap<>();
	    for(Integer value: list1){
	    for(Map.Entry<String,Integer> map2:map1.entrySet()){
	        if(value==map2.getValue()){
	            map3.put(map2.getKey(),map2.getValue());
	        }
	    }
	    }
            System.out.println("Sorted HashMap:");
	    System.out.println(map3);
	}
}
