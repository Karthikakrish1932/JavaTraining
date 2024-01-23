import java.util.Scanner;
class Factorial{
public static void main(String[] args)
{
Scanner myObj=new Scanner(System.in);
System.out.print("Enter the number:");
int n = myObj.nextInt ();
int factorial=1;
int i=1;
while(i<=n)
{
factorial=factorial*i;
i++;
}
System.out.println("Factorial of the number:"+factorial);
}
}



  