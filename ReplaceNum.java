package collection1;

import java.util.ArrayList;

public class ReplaceNum {
	public static void main(String[]args) {
	ArrayList<Integer> nums=new ArrayList<>();
	nums.add(12);
	nums.add(15);
	nums.add(22);
	nums.add(25);
	nums.add(30);
	nums.add(34);
	nums.add(40);
	nums.add(44);
	nums.add(50);
	nums.add(55);
	
	
	for(int i=0;i<nums.size();i++) {
	if(nums.get(i)%2!=0) {
		nums.set(i,2);
	}
	}  
	System.out.println(nums);
	

}
}