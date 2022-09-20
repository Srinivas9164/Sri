package collection1;

import java.util.ArrayList;

public class Student1 {
	public static void main(String[]args) {
		ArrayList<Integer>stdId=new ArrayList<>();
		stdId.add(101);
		stdId.add(120);
		stdId.add(103);
		stdId.add(104);
		
		//for(int i=0;i<stdId.size();i++) {
			//System.out.println(stdId.get(i));
		//}
	//for(Integer id:stdId) {
			//System.out.println(id);
		//for(int i=stdId.size()-1;i>=0;i--) {
			//if(stdId.get(i)%2==0) {
				//System.out.println(stdId.get(i)+" Even Number");
			//}
			//else {
				//System.out.println(stdId.get(i)+" Odd Number");
			//}

				//int max=0;
				//for(int i=0;i<stdId.size();i++) {
					//if(stdId.get(i)>max) {
						//max=stdId.get(i);
					//}
				//}
				//System.out.println(max);
		int min=stdId.get(0);
		for(int i=0;i<stdId.size();i++) {
			if(stdId.get(i)<min) {
				min=stdId.get(i);
			}
		}
		
		
		System.out.println(min);
		}
}

	


