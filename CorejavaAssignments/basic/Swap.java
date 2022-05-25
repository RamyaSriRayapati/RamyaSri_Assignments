package project;

public class Swap {
	public static void swap(int[] arr,int i,int j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String args[]) {

		int [] arr =new int[] {10,20};
		printArray(arr);
		swap(arr,0,1);
		printArray(arr);

	}
	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println(" ");
	}
}


