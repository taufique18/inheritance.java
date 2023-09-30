package inheritance;

public class Technician extends Employee {
	  private String Skill;

	public Technician(String name, int empId, String Skill) {
		super(name, empId);
		this.Skill=Skill;
	}

	public String getSkill() {
		return Skill;
	}

	public void setSkill(String Skill) {
		this.Skill = Skill;
	}
	  
	  public void display() {
		  System.out.println("Technician Details :");
		  super.display();
		  System.out.println("SPECIALIZATION:"+Skill);
		  System.out.println("-------------------------------------");
	  }
	}