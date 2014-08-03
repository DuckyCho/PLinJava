package sorting;

import java.util.List;


public class Print {
	public Print(NumberSet numset){
		for( int i = 0 ; i < numset.nums.size() ;  i++){
			System.out.print(numset.nums.get(i));
			System.out.print("  ");
		}
		System.out.println();
	}
	
	public Print(List<Integer> a1){
		for( int i = 0 ; i < a1.size() ;  i++){
			System.out.print(a1.get(i));
			System.out.print("  ");
		}
		System.out.println();
	}
	

}
