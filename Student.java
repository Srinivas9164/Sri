package collection1;

public class Student {
	private String name;
	private int rollNum;
	private int age;
	private boolean isMale;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setrollNum(int rollNum) {
		this.rollNum=rollNum;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
		
	}
	public Student(String name,int rollNum,int age,boolean isMale) {
		this.name=name;
		this.rollNum=rollNum;
		this.age=age;
		this.isMale=isMale;
	}
	public String toString() {
		return name+" "+rollNum+" "+age+" "+isMale;
	}

}
