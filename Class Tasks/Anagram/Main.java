import java.util.*;
public class Main
{
public boolean anagram(String a, String b){
int count[] = new int[26];
for(char c : a.toCharArray())
count[Character.toLowerCase(c)-'a']++;
for(char c : b.toCharArray())
count[Character.toLowerCase(c)-'a']--;
for(int i=0;i<26;i++){
if(count[i]!=0)
return false;
}
return true;
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the first string: "); 
String a=scan.nextLine();
System.out.println("Enter the second string: "); 
String b=scan.nextLine();
Main obj = new Main();
boolean result=obj.anagram(a,b);
System.out.print("The two strings are "); 
System.out.print(result==true?"Anagram":"Not an anagram");
}
}