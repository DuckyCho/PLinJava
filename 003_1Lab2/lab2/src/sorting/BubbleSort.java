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
		while(size > 0){
			for( int i = size ; i >0 ; i--){
				if(a1.get(i) < a1.get(i-1))
					Collections.swap(a1, i, i-1);
				
				else
					continue;
			}
			
			size -= 1;
		}
		
	}

	@Override
	public String getSortingType() {
		return "B";
	}

}
