class Main{
public static void main(String[] args)
{
int numbers[]={4,3,6,2,10};
boolean n=false;
for(int i=0;i<numbers.length;i++)
{
if(numbers[i]==6)
{
n=true;
break;
}
}
if(n==true)
System.out.println("Found");
else
System.out.println("Not Found");
}
}


