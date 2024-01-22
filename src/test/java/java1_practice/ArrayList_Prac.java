package java1_practice;

import java.util.ArrayList;

public class ArrayList_Prac {

	public static void main(String[] args) {
	ArrayList<Integer> sub=new ArrayList<Integer>();
	sub.add(10);
	sub.add(20);
	sub.add(30);
	sub.set(0, 12);// set method we use to change/replace the data
	//System.out.println(sub.get(0));
	//System.out.println(sub.size());
	for(int q =0;q <sub.size();q++) {//to print individual data
	//System.out.println(sub.get(q));
	
	}
	sub.remove(2);
	System.out.println(sub);
	
	
	}

}
