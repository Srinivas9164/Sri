package collection1;

public class Employee {
	private String name;
	private int ages;
	private int id;
	private int salary;
	private boolean isMale;
	
	public void setName(String name) {
    this.name=name;
	}
	public String getName() {
	return name;
}
	public void setAge(int age) {
		this.ages=age;
	}
	public int getAge() {
		return ages;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
		
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
		
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public Employee(String name,int age,int id,int salary,boolean isMale) {
		this.name=name;
		this.ages=age;
		this.id=id;
		this.salary=salary;
		this.isMale=isMale;
	}
	public String toString() {
		return name+" "+ages+" "+id+" "+ salary+" "+ isMale;
		
	}
 
	

}
