class Minimum
{
public static void main(String[] args)
{
int numbers[]=new int[5];
numbers[0]=8;
numbers[1]=2;
numbers[2]=7;
numbers[3]=1;
numbers[4]=5;
int length=numbers.length;
int min=numbers[0];
for(int i=1;i<length;i++)
{
if(numbers[i]<min)
min=numbers[i];
}
System.out.println("Minimum Element:"+min);
}
}

