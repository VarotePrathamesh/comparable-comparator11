
public class Employee implements Comparable<Employee> {

	int id;
	String name;
	String address;
	
	public Employee(int id, String name ,String address) {
		
		this.id=id;
		this.name=name;
		this.address=address;
		}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.getName().compareTo(o.getName());
	//}
	
	

	@Override
	public int compareTo(Employee o) {
		 if(this.getId()==o.getId())
		 return 0;
		 
		 else if (this.getId()<o.getId())
		 return 1;
		 
		 else
			 return -1;
	
	
	}
}
