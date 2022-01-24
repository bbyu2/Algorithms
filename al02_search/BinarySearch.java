package al02_search;

import java.util.Scanner;

public class BinarySearch {
   //   ���� �˻�(BinarySearch)
   //   �����Ͱ� ���ĵǾ� �־�� �Ѵ�.
   //   ��� ��ġ�� ���Ͽ� �˻��Ѵ�.

   ///
   static int binarySearch(int arr[], int n, int key) {
      int left = 0;         ///   ���� ���� index
      int right = n-1;      ///   ������ ������ index ������ ��
      
      do {
         ///   �߰� index�� ���Ѵ�.
         int center = (left+right)/2;
         if(key == arr[center]) {
            return center;
         }else if(arr[center] < key) {      ///   ã�����ϴ� ���� �߾Ӱ����� ũ��
            ///   ã�����ϴ°� �߾� ������ ũ�� left�� center+1�� �ٲ���
            left = center+1;
         }else {
            right = center-1;            /// left�� right ���� �ٿ��ֱ�
         }
      }while(left <= right);
      ///   �˻��� ���� ���� ��� -1����
      return -1;
   }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub

      //   ������ �غ����~!
      Scanner s = new Scanner(System.in);
      
      System.out.print("�����ͼ� : ");
      int n = s.nextInt();
      
      //   �Է¹��� �� ��ŭ �迭 ����
      int arr[] = new int[n];
      
      for(int i=0; i<n; i++) {
         System.out.print("arr["+i+"] : ");
         arr[i] = s.nextInt();
      }
      //   �˻��� �� �Է�
      System.out.print("�˻��� ������ : ");
      int key = s.nextInt();
      
      
      //   ���� �˻�
      int result = binarySearch(arr, n, key);
      if(result>=0) {
         System.out.println(key+"�� arr["+result+"] ��ġ�� �����մϴ�.");
      }else {
         System.out.println(key+"�� �������� �ʴ� �������Դϴ�.");
      }
      
      
      
   }

}