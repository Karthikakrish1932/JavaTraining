import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=scan.nextInt();
	int original=n;
	int sum=0;
	while(n>0){
	    int rem=n%10;
	    int cube=rem*rem*rem;
	    sum=sum+cube;
	    n=n/10;
	}
	if(sum==original)
	System.out.println("Armstrong Number");
	else
	System.out.println("Not a Armstrong Number");
	}
}