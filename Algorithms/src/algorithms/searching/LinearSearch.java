package algorithms.searching;
/**
 * 
 * @author Mohammed.Faisal
 *
 */
public class LinearSearch {
	
	public static void linearSearch(int key, int[] array){
		
		if(array.length <= 0){
			System.err.println("Element not found");
			return;
		}
		
		int length = array.length;
		for(int i=0; i< length ; i++){
			if(array[i] == key){
				System.err.println("Element "+key+" found at "+(i+1)+" th position");
				break;
			}
		}
	}
	
	public static void main(String[] args){
		linearSearch(10, new int[]{11, 27, 51, 80, 33, 5, 89, 10});
	}
	
}
