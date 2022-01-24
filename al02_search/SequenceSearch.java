package al02_search;

import java.util.Scanner;

//   �����˻� (LinearSearch, SequenceSearch)
//   ���������� �˻��Ѵ�.

public class SequenceSearch {

   ///   for�� �̿��Ͽ� �˻��ϱ�
   ///   key�� ���� �ִ� ��ġ�� ���Ͽ� index�� ��ȯ�ϴ� �޼ҵ�
   ///               �����Ͱ� ��� �迭, ������ ��
   static int linearSearch1(int[] data, int n, int key) {
      
      ///   �迭���� key���� �˻��Ͽ� index�� return �Ѵ�.
      ///   ���࿡ �˻��� index�� ������ -1�� return �Ѵ�.
      for(int i = 0; i<n; i++) {         ///   0,1,2,3,...
         if(data[i]==key) {            ///   data[i]��°�� ã������ ������
            return i;               ///   i�� �����Ѵ�.
         }
      }
      return -1;                     ///   ã�� ���� �迭 �ȿ� ���� �� ������
      
   }
   
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner s = new Scanner(System.in);
      //   �������� ���� �Է� : �迭�� ����
      System.out.print("��Ҽ�:");
      int n = s.nextInt();
      
      //   �迭�� ����   
      int data[] = new int[n];         //   ���� n=5, -> 0,1,2,3,4 ���尡��
      
      //   ������ �Է�
      for(int i=0; i<n; i++) {
         data[i] = s.nextInt();         //   �迭�� ũ�⸸ŭ �ݺ��Ǹ鼭 �迭�� �Է��� ����
         System.out.print("x["+i+"] : "+ data[i]);
      }
      /////////////////////////////////   ������ �غ� ��
      //   ������ �ʿ��� �ڷḦ �غ��ϴ� ������ ����!! ��������
   
      
      //   ���� �˻��ؾ���
      //   ã�� ���ڸ� �Է¹޴´�.
      System.out.print("�˻��� ��:");
      int key = s.nextInt();
      
      
      //   for�� �̿��� �����˻� ȣ��
      int idx = linearSearch1(data,n,key);   //   index�� ���Ϲ���, �������� �˻��ؼ� �ּҸ� �ް� ���� ���⼭ ���ϰڴ� �ǹ�
                                    //   -1, 0,1,2,3,...
      if(idx>=0) {         ///   �˻��� �����Ͱ� ���� ���� 
         System.out.println(key+"�� data["+idx+"] ��ġ�� �ֽ��ϴ�.");
      }else {         ///   �˻��� �����Ͱ� ���� ��
         System.out.println(key+"�� �������� �ʴ� �������Դϴ�.");
      }            
      
   }

}