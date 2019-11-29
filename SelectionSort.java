package Java_Nov;
import java.util.Scanner;

public class SelectionSort {

	public void Selection(int []arr) {
		int temp;
		int min;
		
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort EE = new SelectionSort();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("선택 정렬");
		
		int arr[]= new int[10];
		
		System.out.println("정수를 10개를 입력해 주세요 :");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		EE.Selection(arr);	
		
		for(int i =0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		scanner.close();
	}
}