import java.io.File;
public class Main{
public static void main(String args[]){
File file = new File("C:\\Users\\karth\\OneDrive\\Documents\\JAVA\\FileHandling\\Test.txt");
try{
if(file.exists()){
file.delete();
}
file.createNewFile();
}catch (Exception e){
System.out.println("File creation error: "+ e.getMessage());
}
}
}