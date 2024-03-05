/*Implement a Java program that converts a list to a set and vice versa. 
Initialize an ArrayList with integers and convert it into a HashSet. 
Then, convert the HashSet back into an ArrayList. Print both the list and the set after each conversion.*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        Set<Integer> set1 = new HashSet<>(list1);
        System.out.println("ArrayList to HashSet:");
        for(Integer num:set1){
        System.out.print(num+" ");
        }
        System.out.println();
        List<Integer> list2 = new ArrayList<>(set1);
        System.out.println("HashSet to ArrayList:");
        for(Integer num:list2){
        System.out.print(num+" ");    
        }
    }
}