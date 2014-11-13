package algorithms.searching;

/**
 * @author Mohammed.Faisal
 *
 */
public class BinarySearch {
	
	public static void binarySearch(int key, int[] array){
		
		if(array.length <= 0){
			System.out.println("Empty array");
			return;
		}
		
		int start = 0;
		int end = array.length -1;
		int middle;
		while(start <= end){
			
			middle = (start+end)/2;
			System.out.println("Searching... start : "+start+" end : "+end+" middle : "+middle);
			
			if(key == array[middle]){
				System.out.println("Element "+key+" found at "+(middle+1)+" th position");
				return;
			}else if(key < array[middle]){
				end = --middle;
			}else if(key > array[middle]){
				start = ++middle;
			}
		}
		if(start > end){
			System.out.println("Element "+key+" not found");
			return;
		}
	}
	
	public static void main(String[] args) {
		binarySearch(37, new int[]{11, 27, 33, 37, 40, 53, 69, 74, 89, 96});
	}
	
	
	
}
