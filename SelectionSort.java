public class SelectionSort implements SortingAlgorithm{
	public int smallestIndx, temp;

	public void sort (int arr []){

		for (int i=0; i<arr.length-1;i++){
			smallestIndx = i;
			for (int j=i+1; j<arr.length;j++){
				if (arr[j]<arr[smallestIndx]){
					temp=arr[j];
					arr[j]= arr[smallestIndx];
					arr[smallestIndx]= temp;
				}
			}
		}

	}

}