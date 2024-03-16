class Vehicle{
public void drive(){
System.out.println("Driving a vehicle");
}
}
class Car extends Vehicle{
public void drive(){
System.out.println("Driving a car");
}
}
public class Main 
{
public static void main(String[] args) {
Vehicle obj1 = new Vehicle();
Car obj2 = new Car();
Vehicle[] vehicles = new Vehicle[]{obj1,obj2};/*if you want to create an array that can hold objects of different classes,
you can use the common superclass or interface as the data type for the array.*/
/*If you're referring to storing references to objects of different classes (e.g., Vehicle and Car) in the array, 
you must store references to objects of those classes, not string literals.*/
for(Vehicle str:vehicles){
str.drive(); 
}
}
}