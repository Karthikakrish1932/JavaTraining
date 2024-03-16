class Vehicle{
public void drive(){
System.out.println("Class Vehicle");
}
}
class Car extends Vehicle{
public void drive(){
System.out.println("Class Car");
}
}
public class Main 
{
public static void main(String[] args) {
Vehicle vehicle = new Vehicle();
vehicle.drive(); 
Car car = new Car(); 
car.drive();
}
}