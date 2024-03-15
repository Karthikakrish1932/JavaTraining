import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=scan.nextInt();
	int sum=0;
	for(int i=1;i<=n/2;i++){
	    if(n%i==0){
	        sum=sum+i;
	    }
	}
	if(sum==n)
	System.out.println(n+" is a Perfect Number");
	else
	System.out.println(n+" is Not a Perfect Number");
	}
}
