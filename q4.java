package homework_day_6;

import java.util.Arrays;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		
		int number = 0;
		int[] even = new int[size];
		int[] odd = new int[size];
		int evenIndex = 0, oddIndex = 0; 
		System.out.println("enter the elements in array");
		for(int i = 0; i<size; i++) {
			number=sc.nextInt();
			if(number%2==0) {
				even[evenIndex++] = number;
			}else {
				odd[oddIndex++] = number;
			}
		}
		
		System.out.println("even array out of given array");
		for(int i = 0; i<evenIndex; i++) {
			System.out.println(even[i]);
		}
		System.out.println("odd array out of given array");
		for(int i = 0; i<oddIndex; i++) {
			System.out.println(odd[i]);
		}
		
	}

}
