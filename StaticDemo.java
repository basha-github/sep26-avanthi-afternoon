class Student{
	int id;
	String name;
	static String collegeName= "Awanshi";
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
	}
}
public class StaticDemo {

	public static void main(String[] args) {

		
		Student s1 = new Student(123,"Ramu");
		Student s2 = new Student(456,"Raju");
		
		
		Student.collegeName = "Avanthi";
		//s2.collegeName = "Avanthi";
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}

