import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.remove(0);
        System.out.println("First index number: " + numbers.get(1));
        System.out.println(numbers);
        System.out.println(numbers.size());
        
    }
}