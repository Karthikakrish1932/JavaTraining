public class Main
{
public static void main(String[] args) {
int n=7;
for(int i=0;i<n;i++){
for(int k=1;k<=i;k++){
System.out.print("  ");
}
for(int j=1;j<=n-i;j++){
System.out.print("* ");
}
System.out.println();
}
for(int i=2;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print("  ");
}
for(int j=0;j<i;j++){
System.out.print("* ");
}
System.out.println();
}
}
}