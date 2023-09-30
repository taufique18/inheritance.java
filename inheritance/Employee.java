package inheritance;

public class Employee {
    private String name;
    private int empId;
	public Employee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
    
	public void display() {
		System.out.println("Name :" + getName());
		System.out.println("EmpId  :" + getEmpId());
		
	}
    
    
}