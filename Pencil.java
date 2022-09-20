package collection1;

import java.util.ArrayList;

public class Pencil {
	public static void main(String[]args) {
		ArrayList<String>pencilBrand=new ArrayList<>();
		pencilBrand.add("Natraj");
		pencilBrand.add("Absara");
		pencilBrand.add("Camlin");
		pencilBrand.add("Toms");
		pencilBrand.add("Reno");
		
		//for(int i=0;i<pencilBrand.size();i++) {
			//System.out.println(pencilBrand.get(i));
		//for(int i=pencilBrand.size()-1;i>=0;i--) {
			//System.out.println(pencilBrand.get(i));
		//for(String s:pencilBrand) {
			//System.out.println(s);
		//for(int i=0;i<pencilBrand.size();i++) {
			//System.out.println(pencilBrand.get(i).charAt(0));
		//for(int i=0;i<pencilBrand.size();i++) {
			//System.out.println(pencilBrand.get(i).charAt(pencilBrand.get(i).length()-1));
		//int max=0;
		//String temp="";
		//for(int i=0;i<pencilBrand.size();i++) {
			//if(pencilBrand.get(i).length()>max) {
				//max=pencilBrand.get(i).length();
			//temp=pencilBrand.get(i);
		pencilBrand.forEach(s->System.out.println(s));
		}
	}
	



