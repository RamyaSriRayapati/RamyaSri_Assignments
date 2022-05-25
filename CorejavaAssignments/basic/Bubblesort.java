package project;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int [] a= new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("array before sorted:" + Arrays.toString(a));
		int n=a.length;
		int i,j;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("array after sorted:" + Arrays.toString(a));
	}

}
