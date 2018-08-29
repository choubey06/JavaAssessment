package Assessment;

import static java.lang.System.out;

import java.util.Scanner;

public class BubbleSort {

	void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void arrayPrint(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = new int[5];
		out.println("Enter 5 Numbers");
		for (int i = 0; i < a.length; i++) {
			Scanner tempi = new Scanner(System.in);
			a[i] = tempi.nextInt();
		}
		BubbleSort obj = new BubbleSort();
		obj.bubbleSort(a);
		out.println("Sorted Array using BubbleSort:");
		obj.arrayPrint(a);
	}

}
