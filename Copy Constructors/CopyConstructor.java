public class CopyConstructor
{
    int id;
    String name;
    CopyConstructor(int i, String s)
    {
        id=i;
        name=s;  
    }
    CopyConstructor(CopyConstructor obj)
    {
        id=obj.id;
        name=obj.name;
    }
    void display()
    {
        System.out.println(id +" "+ name);
    }
  public static void main(String[] args) 
  {
   CopyConstructor obj1 = new CopyConstructor(5,"karthi");
   CopyConstructor obj2 = new CopyConstructor(obj1);
   obj1.display();
   obj2.display();
  }
}