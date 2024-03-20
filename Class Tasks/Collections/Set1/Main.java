/*Write a Java program to compare two sets and retain elements which are same on both sets*/
import java.util.*;
public class Main{
public static void main(String[] args){
Set<Integer> set1 = new LinkedHashSet<>();
Set<Integer> set2 = new LinkedHashSet<>();
Set<Integer> set3 = new LinkedHashSet<>();
set1.add(10);
set1.add(5);
set1.add(20);
set1.add(15);
set1.add(30);
set2.add(5);
set2.add(7);
set2.add(50);
set2.add(10);
set2.add(20);
for(int num1 : set1)
{
for(int num2 : set2)
{
if(num1==num2)
set3.add(num1);
}
}
System.out.println("Elements in the set1: " + set1);
System.out.println("Elements in the set2: " + set2);
System.out.println("Common elements in both sets: " + set3);
}
}
