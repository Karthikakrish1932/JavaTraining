import java.io.Console;
public class Math
{
  int c[] = new int[4];
  int add (int a, int b)
  {
    c[0] = a + b;
    return c[0];
  }
  int sub (int a, int b)
  {
    c[1] = a - b;
    return c[1];
  }
  int multiply (int a, int b)
  {
    c[2] = a * b;
    return c[2];
  }
  int divide (int a, int b)
  {
    c[3] = a / b;
    return c[3];
  }
  public static void main (String[]args)
  {
   Console con = System.console();
   System.out.print("A value:");
   int a=Integer.parseInt(con.readLine());
   System.out.print("B value:");
   int b=Integer.parseInt(con.readLine());
   Math m = new Math ();
   System.out.println (m.add (a,b));
   System.out.println (m.sub (a,b));
   System.out.println (m.multiply (a,b));
   System.out.println (m.divide (a,b));
  }
}