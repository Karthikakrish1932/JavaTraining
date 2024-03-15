import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
  Scanner scan = new Scanner (System.in);
  System.out.print("Enter the limit: ");
  int n = scan.nextInt();
  int a = 0;
  int b = 1;
  System.out.print("Fibonacci Series: ");
  System.out.print(a+" ");
  System.out.print(b+" ");
  for(int i=2;i<n;i++)
  {
  int c=a+b;
  System.out.print(c+" ");
  a=b;
  b=c;
}
}
}
