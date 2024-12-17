package homework_day_6;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int[] arr1 = new int[size];
		int merge[] = new int[size+size];
		System.out.println("enter the elements in 1 array");
		for(int i = 0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the elements in 2 array");
		for(int i = 0; i<size; i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i = 0; i<size; i++) {
			merge[i] = arr[i];
		}
		for(int i = 0; i<size; i++)
		{		
			merge[size+i] = arr1[i];
		}
		for(int i = 0; i<merge.length; i++) {
			System.out.println(merge[i]);
		}

	}

}
