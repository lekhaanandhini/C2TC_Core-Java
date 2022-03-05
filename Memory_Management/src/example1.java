class Student{
	int rollno;
	String name;
	public void finalize() {
		System.out.println("Garbage is collected");
	}
}
public class example1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1=s2;
		System.gc();

	}

}
