class SumDigits{
public static void main(String[] args)
{
int num=543,rem,sum=0;
while(num>0)
{
rem=num%10;
sum+=rem;
num=num/10;
}
System.out.print(sum);
}
}