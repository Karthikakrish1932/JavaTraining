class Main{
public static void main(String[] args)
{
int arr1[] = {1, 2, 3};
int arr2[] = {4, 5, 6};
int mergedArray[]= new int[arr1.length+arr2.length];
for(int i=0;i<arr1.length;i++)
{
mergedArray[i]=arr1[i];
System.out.print(mergedArray[i]+" ");
}
for(int j=0;j<arr2.length;j++)
{
mergedArray[arr1.length+j]=arr2[j];
System.out.print(mergedArray[arr1.length + j]+" ");
}
}
}


