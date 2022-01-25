package al02_sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayBubbleSort {
	
	public static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//버블정렬 : 오름차순          데이터 배열, 데이터 수(10)
	public static void mySort(int a[], int n) {
		for(int j = n-1; j > 0; j--) {//j=9
			//     8       9
			if (a[j-1] > a[j]) {
				//교환
				swap(a,j-1,j);
			}
		}
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		int arr[] = new int [10];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = ran.nextInt(100)+1; //0~99
		}
		
		System.out.println("정렬  전 : " + Arrays.toString(arr));
		mySort(arr,arr.length);
		System.out.println("1번 정렬 : "+Arrays.toString(arr));
		
	}

}