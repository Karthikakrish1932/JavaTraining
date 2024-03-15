public class Car
{
private String make;
private String model;
private int year;
public Car(String make,String model,int year){
    this.make=make;
    this.model=model;
    this.year=year;
}
public String getMake(){
    return make;
}
public String getModel(){
    return model;
}
public int getYear(){
    return year;
}
public static void main(String[] args) {
Car obj = new Car("Toyota", "Camry",2022);
System.out.println("Make: "+obj.getMake()); 
System.out.println("Model: "+obj.getModel());
System.out.println("Year: "+obj.getYear());
}
}
