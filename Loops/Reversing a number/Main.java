class Main{
public static void main(String[]args){
int num=321;
int temp=num;
int rev=0;
while(num>0)
{
int digit=num%10;
rev=rev*10+digit;
num=num/10;
}
System.out.println("Reverse of "+ temp +" : " +rev);
}
}
