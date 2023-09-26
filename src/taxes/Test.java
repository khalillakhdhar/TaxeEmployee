package taxes;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em1=new Employee("test", "admin", 2000);
		Employee em2=new Employee("test2", "ouvrier", 700);
		Employee em3=new Employee("test3", "ing", 1300);
		System.out.println(em1.toString());
		System.out.println(em2.toString());
		System.out.println(em3.toString());
		
		

	}

}
