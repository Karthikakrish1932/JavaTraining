public class Main
{
public static void main(String[] args) {
int n=7;
for(int i=7;i>=1;i--){ 
for(int k=1;k<=n-i;k++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print(j+" ");   
}
System.out.println();
}
}
}