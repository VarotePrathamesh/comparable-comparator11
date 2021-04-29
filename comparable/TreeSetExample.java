import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs

		Set set = new TreeSet();
		
		Employee e1= new Employee(21,"Prathamesh","Mangoli");
		Employee e2= new Employee(24,"Sushant","Kolhapur");
		Employee e3= new Employee(19,"Adinath","Sangli");
		Employee e4= new Employee(20,"Rahul","Pune");
		Employee e5= new Employee(22,"Pratik","Satara");
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		for(Object obj:set) {
			System.out.println(obj);
		}
		
		
		}

}
