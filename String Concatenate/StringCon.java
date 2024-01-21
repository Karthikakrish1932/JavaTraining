import java.io.Console;
class StringCon{
public static void main(String[]args){
Console con = System.console();
String str1 = con.readLine();
String str2 = con.readLine();
System.out.println("String1:"+str1);
System.out.println("String2:"+str2);


System.out.println("result:" + str1 + str2);

con.flush();
}
}