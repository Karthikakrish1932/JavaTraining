class Main{
public static void main(String[] args)
{
int arr1[] = {1,2,3,2,6,2};
int count=0, element=2;
for(int i=0;i<arr1.length;i++)
{
if(arr1[i]==element)
count++;
}
System.out.println("Number of occurrences of "+element+" : "+count+" times");
}
} 



