package homework_day_6;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("enter the elements in array");
		for(int i = 0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("given array is sorted");
		for(int i = 0; i<size; i++) {
			System.out.println(arr[i]);
		}
	}

}