import java.util.Scanner;
class Main{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the first number:");
int a=scanner.nextInt();
System.out.println("Enter the second number:");
int b=scanner.nextInt();
int gcd=findGcd(a,b);
System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
}
public static int findGcd(int a, int b)
{
int gcd=1;
for(int i=1;i<=a && i<=b;i++)
{
if(a%i==0 && b%i==0){
gcd=i;
}
}
return gcd;	
}
}

