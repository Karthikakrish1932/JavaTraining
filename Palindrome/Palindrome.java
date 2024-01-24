import java.util.Scanner;
class Palindrome
{
  public static void main (String[]args)
  {
    Scanner myObj = new Scanner (System.in);
    System.out.print("Enter the number:");
    int n = myObj.nextInt ();
    int rem,cube;
    int rev = 0;
    int original=n;
    while (n > 0)
    {
	rem = n % 10;
	rev = rev*10+rem;
    n = n/10;
    }
    if (rev == original)
      System.out.println(original + " is a palindrome");
    else
      System.out.println(original + " is not a palindrome");      
  }
}
