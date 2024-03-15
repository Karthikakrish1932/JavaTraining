import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the word:");
String str=scan.nextLine();
String rev="";
int length=str.length();
for(int i=length-1;i>=0;i--){
rev+=str.charAt(i);
}
if(str.toLowerCase().equals(rev.toLowerCase()))
System.out.println(str+" is a Palindrome");
else
System.out.println(str+" is not a Palindrome");
}
}