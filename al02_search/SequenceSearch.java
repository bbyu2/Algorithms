package al02_search;

import java.util.Scanner;

//   선형검색 (LinearSearch, SequenceSearch)
//   순차적으로 검색한다.

public class SequenceSearch {

   ///   for문 이용하여 검색하기
   ///   key의 값이 있는 위치를 구하여 index를 반환하는 메소드
   ///               데이터가 담긴 배열, 데이터 수
   static int linearSearch1(int[] data, int n, int key) {
      
      ///   배열에서 key값을 검색하여 index를 return 한다.
      ///   만약에 검색된 index가 없으면 -1을 return 한다.
      for(int i = 0; i<n; i++) {         ///   0,1,2,3,...
         if(data[i]==key) {            ///   data[i]번째랑 찾을값이 같으면
            return i;               ///   i값 리턴한다.
         }
      }
      return -1;                     ///   찾는 값이 배열 안에 없을 때 내려옴
      
   }
   
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner s = new Scanner(System.in);
      //   데이터의 갯수 입력 : 배열을 생성
      System.out.print("요소수:");
      int n = s.nextInt();
      
      //   배열을 생성   
      int data[] = new int[n];         //   만약 n=5, -> 0,1,2,3,4 저장가능
      
      //   데이터 입력
      for(int i=0; i<n; i++) {
         data[i] = s.nextInt();         //   배열의 크기만큼 반복되면서 배열에 입력을 받음
         System.out.print("x["+i+"] : "+ data[i]);
      }
      /////////////////////////////////   데이터 준비 끝
      //   지금은 필요한 자료를 준비하는 과정일 뿐임!! 위에까지
   
      
      //   이제 검색해야함
      //   찾을 숫자를 입력받는다.
      System.out.print("검색할 값:");
      int key = s.nextInt();
      
      
      //   for를 이용한 선형검색 호출
      int idx = linearSearch1(data,n,key);   //   index를 리턴받음, 위에서는 검색해서 주소만 받고 값은 여기서 정하겠단 의미
                                    //   -1, 0,1,2,3,...
      if(idx>=0) {         ///   검색한 데이터가 있을 때와 
         System.out.println(key+"는 data["+idx+"] 위치에 있습니다.");
      }else {         ///   검색한 데이터가 없을 때
         System.out.println(key+"는 존재하지 않는 데이터입니다.");
      }            
      
   }

}