package collection1;

public class Institute {
	private String name;
	private int noOfCourse;
	private int duration;
	private int fee;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setNoOfCourse(int noOfCourse) {
		this.noOfCourse=noOfCourse;
	}
	public int getNoOfCourse() {
		return noOfCourse;
	}
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setFee(int fee) {
		this.fee=fee;
	}
	public int getFee() {
		return fee;
	}
	public Institute(String name,int noOfCourse,int duration,int fee) {
		this.name=name;
		this.noOfCourse=noOfCourse;
		this.duration=duration;
		this.fee=fee;
	}
	public String toString() {
		return name+" "+noOfCourse+" "+duration+" "+fee;
	}

	}


