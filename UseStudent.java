package collection1;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[]args) {
		Student student1=new Student("Sri",620,14,true);
		Student student2=new Student("Raji",630,15,false);
		Student student3=new Student("Pavithra",555,16,false);
		Student student4=new Student("Ramesh",222,12,true);
		
		ArrayList<Student> stu=new ArrayList<>();
		
		stu.add(student1);
		stu.add(student2);
		stu.add(student3);
		stu.add(student4);
		
		//ArrayList<Student>female=new ArrayList<>();
		//for(Student t:stu) {
			//if(t.getIsMale()==false) {
				//female.add(t);
				
			//}
		//}
		//female.forEach(d->System.out.println(d));
		//ArrayList<Student>roll=new ArrayList<>();
		//for(Student r:stu) {
			////if(r.getRollNum()>500&&r.getRollNum()<700) {
				//roll.add(r);
			//}
		//}
		//roll.forEach(f->System.out.println(f));
		//ArrayList<Student> nameLength=new ArrayList<>();
		//for(Student u:stu) {
			//if(u.getName().length()>4) {
				//nameLength.add(u);
			//}
		//}
		//nameLength.forEach(g->System.out.println(g));
		
		//ArrayList<Student>oddCount=new ArrayList<>();
		//for(Student i:stu) {
			//if(i.getName().length()%2!=0) {
				//oddCount.add(i);
	//		}
		//}
		//oddCount.forEach(l->System.out.println(l));
		ArrayList<Student> even=new ArrayList<>();
		int count=0;
		for(int i=0;i<stu.size();i++) {
			if(stu.get(i).getName().length()>6) {
				count=count+1;
				System.out.println(stu.get(i));
			}
		}
			 System.out.println(count);
		
			 
		
			}
		
			}
	
	


