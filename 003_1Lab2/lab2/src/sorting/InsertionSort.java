package sorting;


import java.util.List;

public class InsertionSort extends Sort {

	private static InsertionSort insertionSort = new InsertionSort();
	private InsertionSort(){};
	
	protected static Sort getInstance(){
		return insertionSort;
	}
	
	public void sorting(List<Integer> a1) {
		int startIdx = 0;
		int endIdx = 0;
		int midIdx = 0;
		int value;
		
		for(int i = 1 ; i < a1.size() ; i++){
			startIdx = 0;
			endIdx = i-1;
		
			while( endIdx >= startIdx){	
				midIdx = (startIdx+endIdx)/2;
				if( a1.get(midIdx) > a1.get(i))
					endIdx = midIdx -1;
				else
					startIdx = midIdx + 1;
				
			}
			
			value = a1.get(i);
			a1.remove(i);
			
			if(value > a1.get(midIdx))
				a1.add(midIdx+1,value);
			else
				a1.add(midIdx,value);
			
		}
		
	}

	
	public String getSortingType() {
		return "I";
	}

}
