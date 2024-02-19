import java.util.Scanner;
class Main
{
  public static void main (String[]args)
  {
    Scanner myObj = new Scanner (System.in);
    System.out.print ("Enter the limit:");
    int n = myObj.nextInt ();
    int a = 1, b = 2, c;
    System.out.println("Fibonacci series:");
    System.out.print(a);
    System.out.print(" ");
    System.out.print(b);
    System.out.print(" ");
    for (int i = 2; i < n; i++)
    {
	c = a + b;
	a = b;
	b = c;
        System.out.print(c);
        System.out.print(" ");
    }
    
  }
}