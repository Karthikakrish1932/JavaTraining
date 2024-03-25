public class Main
{
public static void main(String[] args) {
int n=7;
int letter=65;
for(int i=1;i<=n;i++)	
{
for(int j=0;j<i;j++){
System.out.print((char)(letter+j)+" ");
}
System.out.println();
}
}
}