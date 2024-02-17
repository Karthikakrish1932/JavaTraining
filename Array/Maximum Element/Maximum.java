class Maximum
{
public static void main(String[] args)
{
int numbers[]=new int[5];
numbers[0]=1;
numbers[1]=2;
numbers[2]=7;
numbers[3]=4;
numbers[4]=5;
int length=numbers.length;
int max=numbers[0];
for(int i=1;i<length;i++)
{
if(numbers[i]>max)
max=numbers[i];
}
System.out.println("Maximum Element:"+max);
}
}

