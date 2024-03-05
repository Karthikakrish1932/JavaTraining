import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashMap<String,String> map=new HashMap<>();
	    map.put("name","karthi");
	    map.put("age","22");
	    Map<String,HashMap<String,String>> map1=new LinkedHashMap<>();
	    map1.put("student1",map);
	    map.put("name","sutha");
	    map1.put("student2",map);
	    System.out.println(map1);
	}
}