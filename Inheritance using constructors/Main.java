class Person{
    protected String name;
    protected int age;
    protected char gender;
    Person(String name,int age,char gender){
       this.name=name;
       this.age=age;
       this.gender=gender;
    }
   void displayDetails(){
       System.out.println("Name:"+name);
       System.out.println("Age:"+age);
       System.out.println("Gender:"+gender);
   }
}
class Student extends Person{
    protected int studentId;
    protected String course;
    protected char grade;
    Student(String name,int age,char gender,int studentId,String course,char grade){
        super(name,age,gender);
        this.studentId=studentId;
        this.course=course;
        this.grade=grade;
    }
     void displayDetails(){
       super.displayDetails();
       System.out.println("Student Id:"+studentId);
       System.out.println("Course:"+course);
       System.out.println("Grade:"+grade);
}
}
public class Main{
    public static void main(String[] args){
        Person obj1=new Person("Yuvan",20,'M');
        Student obj2=new Student("Yuvan",20,'M',7,"ECE",'A');
        obj2.displayDetails();
}
}