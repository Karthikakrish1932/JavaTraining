public class Employee
{
private String name="karthi";
private int age;
private int salary;
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
public void setAge(int age){
    this.age=age;
}
public int getAge(){
    return age;
}
public void setSalary(int salary){
    this.salary=salary;
}
public int getSalary(){
    return salary;
}
public static void main(String[] args) {
Employee obj = new Employee();
obj.setName("Abi");
obj.setAge(22);
obj.setSalary(20000);
System.out.println("Name: "+obj.getName()); 
System.out.println("Age: "+obj.getAge());
System.out.println("Salary: "+obj.getSalary());
obj.setSalary(60000);
System.out.println("Updated Salary: "+obj.getSalary());
}
}
