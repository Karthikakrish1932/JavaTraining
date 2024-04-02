public class Main
{
public static void main(String[] args) {
int n=7; 
int letter=65;
for(int i=1;i<=n;i++)
{
for(int k=1;k<i;k++)
{
System.out.print(" ");
}
for(int j=0;j<=n-i;j++)
{
System.out.print((char)(letter+j)+" ");
}
System.out.println();
}
for(int i=1;i<=n-1;i++)
{
for(int k=1;k<n-i;k++)
{
System.out.print(" ");
}
for(int j=0;j<=i;j++)
{
System.out.print((char)(letter+j)+" ");
}
System.out.println();
}
}
}