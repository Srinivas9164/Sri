package collection1;

import java.util.ArrayList;

public class ReverseId {
	public static void main(String[]args) {
		ArrayList<Integer>stdId=new ArrayList<>();
		stdId.add(101);
		stdId.add(120);
		stdId.add(103);
		stdId.add(104);
		
		for(int i=stdId.size()-1;i>=0;i--) {
			System.out.println(stdId.get(i));
		}
		for(Integer id:stdId) {
			System.out.println(id);
		}
	}

}



