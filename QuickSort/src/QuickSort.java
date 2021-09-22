
public class QuickSort {
	public static int partition(int[] array, int begin, int end) {
		int x = array[end];
		int less = begin - 1;
		for (int j = begin; j <= end - 1; j++) {
			if (array[j] < x) {
				less++;
				int temp = array[less];
				array[less] = array[j];
				array[j] = temp;
			}
		}
		int temp1 = array[less + 1];
		array[less + 1] = array[end];
		array[end] = temp1;
		
		return(less + 1);
	}
	
	public static void quickSort(int[] array, int begin, int end) {
		if (begin < end) {
			int q = partition(array, begin, end);
			quickSort(array, begin, q-1);
			quickSort(array, q+1, end);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 2, 5, 6, 8, 7};
		
		quickSort(arr, 0, 5);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
