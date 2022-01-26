package al04_linkedlist;

import java.util.Scanner;

public class LinkedListTestMain {
   static Scanner scan = new Scanner(System.in);
   // ��ȣ�� �̸��� ���� �� �� �ִ� ����Ŭ����
   static class Data{
      private Integer no;
      private String name;
      
      static final int NO = 1; //��ȣ�� �Է� ���� �� Ȯ��
      static final int NAME = 2;//�̸��� �Է� ���� �� Ȯ��
      
      //String �������� ���� ��ȯ
      public String toString() {
         return no+" : " + name;
      }
      //��ȣ �Ǵ� �̸��� �Է� �޴� �޼ҵ�.
      public void scanData(String msg, int s) {
         // s���� 1,2,3 �� �ϳ��� ���� �ȴ�.
         if((s & NO) == NO) {
            System.out.print("��ȣ->");//��ȣ �Է�
            no = scan.nextInt();
         }
         if((s & NAME) == NAME) {
            System.out.print("�̸�->");//�̸� �Է�
            name = scan.next();//������ ������ 1�ܾ �Է�, nextLine()->enter
         }
      }
   }
   
   //�޴��� ���������� �����
   enum Menu{
      Add_FIRST("�Ӹ��� ��� ����"),
      Add_LAST("������ ��� ����"),
      Remove_FIRST("�Ӹ� ��� ����"),
      Remove_CURRENT("���� ��Ʈ ����"),
      DUMP("��� ��� ���"),
      TERMINATE("����");
      
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
   //�޴��� ǥ���ϰ� �޴��� index�� �Է¹޾� ��Ź�� �޴� ��ü �����ϴ� �޼ҵ�
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
      Menu menu; //������ �޴�
      LinkedListTest<Data> list = new LinkedListTest<Data>();
      
      do {
         //�޴� ǥ��
         Data data;
          menu = SelectMenu();
         switch(menu) {
         case Add_FIRST://�Ӹ��� ��� ����
            data = new Data();
            data.scanData("�Ӹ� ��� ����",Data.NO | Data.NAME); // | = ��Ʈ or
            list.addFirst(data);//List�� ����
            break;
         case Add_LAST: //������ ��� ����
            data = new Data();
            data.scanData("������� ����", Data.NO | Data.NAME);
            list.addLast(data);
            break;
         case Remove_FIRST://�Ӹ� ��� ����
        	list.removeFirst();
			break;
         case Remove_CURRENT://���� ��� ����
        	 list.removeCurrent();
			break;
         case DUMP://��� ��� ���
            list.dump();
            break;
         }
      }while(menu!=Menu.TERMINATE);
      System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
      
   }
}