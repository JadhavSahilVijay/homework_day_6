package homework_day_6;
import java.util.*;
public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		arr[0]=1;
		int max = arr[0];
		int min = arr[0];
		System.out.println("enter the elements in array");
		for(int i = 0; i<size; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("maximum elements of array is : "+max);
		System.out.println("minimum elements of array is : "+min);
	}

}
