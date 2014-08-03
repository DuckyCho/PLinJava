package sorting;

import java.util.ArrayList;
import java.util.Random;

public class NumberSet {
	
	public ArrayList<Integer> nums;
	public String type;
	
	public NumberSet(){
		Random rd = new Random();
		int forLoop = rd.nextInt(10)+5;
		
		nums = new ArrayList<Integer>();
		
		for(int i = 0 ; i< forLoop;i++){
			nums.add(rd.nextInt(100));
		}
		
		
		type = "I"; 
	}
	
	public NumberSet(String type){
		Random rd = new Random();
		int forLoop = rd.nextInt(10);
		nums = new ArrayList<Integer>();
	
		for(int i = 0 ; i< forLoop;i++){
			nums.add(rd.nextInt(100));
		}
		this.type = type;
	}
	
	public NumberSet(ArrayList<Integer> a1, String type){
		if(a1 instanceof ArrayList){
		this.nums = (ArrayList<Integer>)a1;}
		this.type = type;
	}
}
