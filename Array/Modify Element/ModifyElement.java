class ModifyElement
{
public static void main(String[] args)
{
int numbers[]=new int[]{1,2,3,4,5};
System.out.println("Original Array:");
for(int i=0;i<5;i++)
{
System.out.println(numbers[i]);
}
numbers[1]=10;
System.out.println("Modified Array:");
for(int i=0;i<5;i++)
{
System.out.println(numbers[i]);
}
}
}