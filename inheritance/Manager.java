package inheritance;

public class Manager extends Employee{
    private String dept;

	public Manager(String name, int empId, String dept) {
		super(name, empId);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void display() {
		System.out.println("Manager Details :");
		super.display();
		System.out.println("DEPT:"+dept);
		System.out.println("-------------------------------------");
	}
}
