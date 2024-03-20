import java.util.*;
public class Main{
public static void main(String[] args){
ArrayList<Integer> arr = new ArrayList<>();
arr.add(10);
arr.add(5);
arr.add(20);
arr.add(15);
arr.add(30);
int max = arr.get(0);
int min = arr.get(0);
for (int i = 1; i < arr.size(); i++) {
int num = arr.get(i);
if (num > max) {
max = num;
}
if (num < min) {
min = num;
}
}
System.out.println("Maximum element in the ArrayList: " + max);
System.out.println("Minimum element in the ArrayList: " + min);
}
}
