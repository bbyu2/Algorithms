package al02_sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayBubbleSort {
	
	public static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//�������� : ��������          ������ �迭, ������ ��(10)
	public static void mySort(int a[], int n) {
		for(int j = n-1; j > 0; j--) {//j=9
			//     8       9
			if (a[j-1] > a[j]) {
				//��ȯ
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
		
		System.out.println("����  �� : " + Arrays.toString(arr));
		mySort(arr,arr.length);
		System.out.println("1�� ���� : "+Arrays.toString(arr));
		
	}

}