import java.util.Scanner;
class Perfect
{
public static void main(String[] args)
{
Scanner myObj=new Scanner(System.in);
System.out.print("Enter the number:");
int n=myObj.nextInt();
int sum=0;
for(int i=1;i<=n/2;i++)
{
 if(n%i==0)
 sum=sum+i;
}
if(sum==n)
System.out.println(n+" is a perfect number");
else 
System.out.println(n+" is not a perfect number");
}
}
 
 



