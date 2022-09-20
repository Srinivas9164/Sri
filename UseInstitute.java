package collection1;

import java.util.ArrayList;

public class UseInstitute {
	public static void main(String[]args) {
		Institute i1=new Institute("Accord",5,3,20000);
		Institute i2=new Institute("Qspider",6,4,30000);
		Institute i3=new Institute("Q",5,4,40000);
		Institute i4=new Institute("S",3,2,25000);
		Institute i5=new Institute("R",6,6,35000);
		Institute i6=new Institute("P",3,2,26000);
		Institute i7=new Institute("D",2,4,32000);
		Institute i8=new Institute("Green",6,4,33000);
		Institute i9=new Institute("Rd",1,2,34000);
		Institute i10=new Institute("Sd",3,4,36000);
		Institute i11=new Institute("Rs",6,4,34000);
		Institute i12=new Institute("Qd",3,1,34500);
		
		ArrayList<Institute>inst=new ArrayList<>();
		inst.add(i1);
		inst.add(i2);
		inst.add(i3);
		inst.add(i4);
		inst.add(i5);
		inst.add(i6);
		inst.add(i7);
		inst.add(i8);
		inst.add(i9);
		inst.add(i10);
		inst.add(i11);
		inst.add(i12);
	ArrayList<Institute>fees=new ArrayList<>();
	inst.forEach(t-> {
		if(t.getFee()>30000&& t.getNoOfCourse()>3) {
			
			fees.add(t);
		}
		
		
	});
		System.out.println(fees);
		
	}
		
	}
		
		


