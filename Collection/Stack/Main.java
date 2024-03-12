import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	Stack <String> stack = new Stack<>();
	stack.push("A");
	stack.push("B");
	stack.push("C");
	stack.push("D");
	System.out.println(stack);
	stack.pop();
	System.out.println(stack);
	stack.pop();
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack.search("B"));
  }
}
