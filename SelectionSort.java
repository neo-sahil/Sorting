package sortingInJava;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in your array:");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the your array's element:");
//		for(int item: a)
//		{
//			item = sc.nextInt();
//		}
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			int minInd=i;
			for(int j=i;j<n;j++)//in this loop we just find the smallest element
			{
				if(a[j]<a[minInd])
					minInd=j;
			}
			int temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
		}
		for(int item : a)
			System.out.print(item+" ");
	}

}
