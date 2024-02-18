class CopyArray 
{
public static void main(String[] args) 
{
int[] numbers = {1, 2, 3, 4, 5};
int[] copyNumbers = new int[5];
for(int i = 0; i < numbers.length; i++) 
{
copyNumbers[i] = numbers[i];
}
System.out.print("copyNumbers array: ");
for(int i = 0; i < copyNumbers.length; i++)
{
int num = copyNumbers[i];
System.out.print(num + " ");
}
}
}
