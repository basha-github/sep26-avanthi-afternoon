class Employee{
	int id;
	String name;
	
	static {
		System.out.println("from static..");
	}
	
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		System.out.println("Employee Got Created....");
	}
	void m1(){
		System.out.println("hello");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class StaticDemo2 {

	public static void main(String[] args) {
		
		Employee emp = new Employee(123,"Ramu");
		

	}

}
