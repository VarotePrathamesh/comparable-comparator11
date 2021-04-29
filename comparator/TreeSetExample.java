import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main (String[] args) {
		Set set1 = new TreeSet<>(new comparatorId());
		Employeee e1=new Employeee(26,"Aditya");
		Employeee e2= new Employeee(21,"Prathamesh");
		Employeee e3= new Employeee(24,"Sushant");
		Employeee e4= new Employeee(19,"Adinath");
		Employeee e5= new Employeee(20,"Rahul");
		Employeee e6= new Employeee(22,"Pratik");
		
			set1.add(e1);
			set1.add(e2);
			set1.add(e3);
			set1.add(e4);
			set1.add(e5);
			set1.add(e6);
			
			
			for(Object obj:set1) {
				System.out.println(obj);
				
			}
				
			Employeee emp1=new Employeee(26,"Aditya");
			Employeee emp2= new Employeee(21,"Prathamesh");
			Employeee emp3= new Employeee(24,"Sushant");
			Employeee emp4= new Employeee(19,"Adinath");
			Employeee emp5= new Employeee(20,"Rahul");
			Employeee emp6= new Employeee(22,"Pratik");	
			
			Set set2=new TreeSet<>(new comparatorName());
				
				set2.add(emp1);
				set2.add(emp2);
				set2.add(emp3);
				set2.add(emp4);
				set2.add(emp5);
				set2.add(emp6);
				
			for(Object obj:set2) {
				System.out.println(obj);
			}
	
			
  
	}

}

	class comparatorId implements Comparator<Employeee>{

		@Override
		public int compare(Employeee o1, Employeee o2) {
			// TODO Auto-generated method stub
			
			//Employeee number1=(Employeee)o1;
			//Employeee number2=(Employeee)o2;
			
			if(o1.getId()==o2.getId())
				return 0;
			
			else if(o1.getId()<o2.getId())
				return -1;
			
			else 
				return 1;
			
			
			
		}
		
	}

	class comparatorName implements Comparator<Employeee>{

		@Override
		public int compare(Employeee o1, Employeee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
		
		 
		
		
		
		
	}









