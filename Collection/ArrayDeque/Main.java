import java.util.*;
public class Main
{
  public static void main(String[]args)
  {
	ArrayDeque <String> queue = new ArrayDeque<>();
	queue.offer("A");
	queue.offer("B");
	queue.offer("C");
	queue.offer("D");
	System.out.println(queue);
	queue.poll();
	System.out.println(queue);
	queue.poll();
	System.out.println(queue);
	System.out.println(queue.peek());
  }
}