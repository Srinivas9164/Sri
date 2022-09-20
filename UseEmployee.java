package collection1;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[]args) {
		Employee emp1=new Employee("Sri",24,777,20000,true);
		Employee emp2=new Employee("Ravi",22,888,25000,true);
		Employee emp3=new Employee("Raji",25,888,26000,false);
		Employee emp4=new Employee("Pavi",23,555,25000,false);
		Employee emp5=new Employee("Ram",21,444,24000,true);
		
		
		ArrayList<Employee>emp=new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		
		//for(int i=0;i<emp.size();i++) {
			//System.out.println(emp.get(i));
		//for(Employee e:emp) {
			//System.out.println(e);
		
	emp.forEach(w->System.out.println(w));
		
		//for(int i=0;i<emp.size();i++) {
			//if(emp.get(i).getSalary()>20000&&emp.get(i).getSalary()<=25000) {
		//}
		   //System.out.println(emp.get(i));
			//System.out.println(emp.get(i).getSalary());
		
		
		//emp.forEach(d->{
			//if(d.getAge()>18) {
				//System.out.println(d);
			//}
           // });
		
		//emp.forEach(d->{
			//if(d.getAge()<25) {
				//System.out.println(d.getName());
			//}
            //});
				//for(int i=0;i<emp.size();i++) {
					//if(emp.get(i).getAge()<23) {
						
						//System.out.println(emp.get(i).getName());
						//System.out.println(emp.get(i));
		
		//for(int i=0;i<emp.size();i++) {
			//if(emp.get(i).getIsMale()==false) {
				//System.out.println(emp.get(i).getIsMale());
				//System.out.println(emp.get(i));
		//emp.forEach(q->{;
		//if(q.getName().startsWith("R")) {
			//System.out.println(q);
	
				//	}
				//});
		
		
	}
}
//}
