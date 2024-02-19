import java.util.Scanner;
class Main{
public static void main(String[] args)
{
Scanner myObj=new Scanner(System.in);
System.out.print("Enter the number:");
int n = myObj.nextInt();
int factorial=1;
for(int i=1;i<=n;i++)
{
factorial=factorial*i;
}
System.out.println("Factorial of the number:"+factorial);
}
}

