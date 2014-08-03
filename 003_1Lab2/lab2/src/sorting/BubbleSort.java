package sorting;

import java.util.Collections;
import java.util.List;

public class BubbleSort extends Sort {

	private static BubbleSort bubbleSort = new BubbleSort();
	private BubbleSort(){}
	public static Sort getInstance(){
		return bubbleSort;
	}
	
	
	@Override
	public void sorting(List<Integer> a1) {
		int size = a1.size()-1;
		int j;
		
		for(int i = 0 ; i < a1.size();i++){
			j = size;
			for(  ; j >i ; j--){
				if(a1.get(j) < a1.get(j-1))
					Collections.swap(a1, j, j-1);
				
				else
					continue;
			}
		}
		
	}

	@Override
	public String getSortingType() {
		return "B";
	}

}
