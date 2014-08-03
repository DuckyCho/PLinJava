package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class QuickSort extends Sort {
	
	
	private static QuickSort quickSort = new QuickSort();
	private QuickSort(){}
	public static Sort getInstance(){
		return quickSort;
	}
	
	@Override
	public void sorting(List<Integer> a1) {
		/*
		a1 = this.quickSorting((ArrayList<Integer>)a1);		
	}
	
	private List<Integer> quickSorting(ArrayList<Integer> a1){
		int pivot;
		int i = 0;
		int j = a1.size()-2;
		ArrayList<Integer> tmp;
		
		
		if(a1.size() == 0 || a1.size() == 1){
			return a1;
		}
		else{
			 pivot = a1.get(a1.size()-1);
			while(i != j){
				if(a1.get(i) > pivot && a1.get(j) <= pivot ) {
					Collections.swap(a1,i,j);
					i++;
					j--;
				}
				else if (a1.get(i) < pivot && a1.get(j) < pivot) {
					i++;
				}
				else if (a1.get(i) >= pivot && a1.get(j) >= pivot){
					j--;
				}
				else{
					i++;
					j--;
				}
			}	

			Collections.swap(a1, i, a1.indexOf(pivot));
			tmp = this.quickSorting((ArrayList<Integer>)a1.subList(0,a1.indexOf(pivot)-1));
			this.quickSorting(a1.subList(a1.indexOf(pivot)+1,a1.size()-1));
			return a1;
		}
		 */
		System.out.println("퀵소트는 아직 구현을 하지 못했습니다.");
	}

	@Override
	public String getSortingType() {
		return "Q";
	}

}
