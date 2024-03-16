class Vehicle{
String make="Toyota";
String model="Camry";
}
class Car extends Vehicle{
public void print(){
System.out.println("Make: "+make);
System.out.println("Model: "+model);
}
}
public class Main 
{
public static void main(String[] args) {
Car obj=new Car();
obj.print();
}
}