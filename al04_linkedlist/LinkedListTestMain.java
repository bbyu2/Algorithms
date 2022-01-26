package al04_linkedlist;

import java.util.Scanner;

public class LinkedListTestMain {
   static Scanner scan = new Scanner(System.in);
   // 번호와 이름을 저장 할 수 있는 내부클래스
   static class Data{
      private Integer no;
      private String name;
      
      static final int NO = 1; //번호를 입력 받을 지 확인
      static final int NAME = 2;//이름을 입력 받을 지 확인
      
      //String 리턴으로 값을 반환
      public String toString() {
         return no+" : " + name;
      }
      //번호 또는 이름을 입력 받는 메소드.
      public void scanData(String msg, int s) {
         // s에는 1,2,3 중 하나가 대입 된다.
         if((s & NO) == NO) {
            System.out.print("번호->");//번호 입력
            no = scan.nextInt();
         }
         if((s & NAME) == NAME) {
            System.out.print("이름->");//이름 입력
            name = scan.next();//공백을 기준을 1단어를 입력, nextLine()->enter
         }
      }
   }
   
   //메뉴를 열거형으로 만들기
   enum Menu{
      Add_FIRST("머리에 노드 삽입"),
      Add_LAST("꼬리에 노드 삽입"),
      Remove_FIRST("머리 노드 삭제"),
      Remove_CURRENT("선택 노트 삭제"),
      DUMP("모든 노드 출력"),
      TERMINATE("종료");
      
      private final String message;
      
      static Menu MenuAt(int idx) {
         for(Menu m:Menu.values()){
            if(m.ordinal()==idx)
               return m;
         }
         return null;
      }
      Menu(String str){
         message = str;
      }
      String geMessage() {
         return message;
      }
   }
   //메뉴를 표시하고 메뉴의 index를 입력받아 선탁한 메뉴 객체 리턴하는 메소드
   static Menu SelectMenu() {
      int key;
      do {
         for(Menu m:Menu.values()) {
            System.out.printf("(%d) %s ",m.ordinal(),m.geMessage());
         }
         System.out.print("->");
         key = scan.nextInt();
      }while(key<Menu.Add_FIRST.ordinal() || key>Menu.TERMINATE.ordinal());
      
      return Menu.MenuAt(key);
   }
   public static void main(String[] args) {
      Menu menu; //선택한 메뉴
      LinkedListTest<Data> list = new LinkedListTest<Data>();
      
      do {
         //메뉴 표시
         Data data;
          menu = SelectMenu();
         switch(menu) {
         case Add_FIRST://머리에 노드 삽입
            data = new Data();
            data.scanData("머리 노드 삽입",Data.NO | Data.NAME); // | = 비트 or
            list.addFirst(data);//List에 저장
            break;
         case Add_LAST: //꼬리에 노드 삽입
            data = new Data();
            data.scanData("꼬리노드 삽입", Data.NO | Data.NAME);
            list.addLast(data);
            break;
         case Remove_FIRST://머리 노드 삭제
        	list.removeFirst();
			break;
         case Remove_CURRENT://선택 노드 삭제
        	 list.removeCurrent();
			break;
         case DUMP://모든 노드 출력
            list.dump();
            break;
         }
      }while(menu!=Menu.TERMINATE);
      System.out.println("프로그램이 종료 되었습니다.");
      
   }
}