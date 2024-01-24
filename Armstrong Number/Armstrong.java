import java.util.Scanner;
class Armstrong
{
  public static void main (String[]args)
  {
    Scanner myObj = new Scanner (System.in);
    System.out.print("Enter the number:");
    int n = myObj.nextInt ();
    int rem,cube;
    int sum = 0;
    int original=n;
    while (n > 0)
    {
	rem = n % 10;
	cube = rem * rem * rem;
	sum += cube;
	n = n/10;
    }
    if (sum == original)
      System.out.println(original + " is an Armstrong Number");
    else
      System.out.println(original + " is not an Armstrong Number");      
  }
}
