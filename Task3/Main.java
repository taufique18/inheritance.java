package inheritance;

public class Main extends Employee {

	public Main(String name, int empId) {
		super(name, empId);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Manager m1 = new Manager("Taufique", 1001,"B.Tech");
        m1.display();
              
        Technician t1= new Technician("Mohammed", 1002, "Java");
        t1.display();
	}

}