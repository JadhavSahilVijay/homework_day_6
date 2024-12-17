package homework_day_6;
import java.util.*;

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("enter the elements in array");
		for(int i = 0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the elements to search in array");
		int x = sc.nextInt();
		boolean found = false;
		for(int i = 0; i<size; i++) {
			if(arr[i]==x) {
				System.out.println(x+" is present in "+i+"th index");
				found = true;
			}
		}
		if(!found) {
			System.out.println(x+" is not present in array");
		}
	}

}
