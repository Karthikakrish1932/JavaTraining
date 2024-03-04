class Main{
public static void main(String[] args)
{
int numbers[]={4,3,6,2,10};
for(int i=0;i<numbers.length;i++)
{
for(int j=0;j<numbers.length-i-1;j++)
{
if(numbers[j]>numbers[j+1])
{
 int temp = numbers[j];
 numbers[j] = numbers[j + 1];
 numbers[j + 1] = temp;
}
}
}
for(int k=0;k<numbers.length;k++)
{
System.out.print(numbers[k]+" ");
}
}
}





