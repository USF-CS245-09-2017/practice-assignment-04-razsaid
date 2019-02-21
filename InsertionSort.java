public class InsertionSort implements SortingAlgorithm{

	public int inserted;
	public void sort (int arr []){
		for (int i=1; i<arr.length;i++){
			inserted = arr[i];
			int j=i-1;
			while (j>=0 && arr[j]>inserted){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]= inserted;
		}

	}

}