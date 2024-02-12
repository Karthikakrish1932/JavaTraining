class Student
{
    private int id;
    private String name;
    private int age;
    private char grade;
    private String address;
    
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setGrade(char grade) {
		this.grade=grade;
	}
	public char getGrade() {
	return grade;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
}
    public class Main {
    public static void main(String[] args){
        Student obj= new Student();
        obj.setId(5);
        obj.setName("yuvi");
        obj.setAge(20);
        obj.setGrade('A');
        obj.setAddress("Chennai");
        System.out.println("ID: " + obj.getId());
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Grade: " + obj.getGrade());
        System.out.println("Address: " + obj.getAddress()); 
}
}