import java.util.Scanner;

public class main {
	  public static void main(String[] args) {
	      Scanner sc1 = new Scanner(System.in);
	      Scanner sc2 = new Scanner(System.in);
	      Scanner sc3 = new Scanner(System.in);
	      Permanent pm;
	      Temporary tm;

	      System.out.println("������� - ������<P>, �ӽ���<T>�� �Է��ϼ���.");
	      String cho = sc1.next();
	      System.out.println(cho);
	      if (cho.equals((String)"P")) {
	         System.out.println("�̸�, �⺻��, ���ʽ��� �Է��ϼ���.");
	         String name = sc1.next();
	         int pay = sc2.nextInt();
	         int bonus = sc3.nextInt();
	         pm = new Permanent(pay, bonus);
	         pm.setName(name);
	         System.out.println(pm.name);
	      }
	      else if(cho.equals((String)"T")) {
	    	 System.out.println("�̸�, �⺻��, ���ʽ��� �Է��ϼ���.");
	         String name = sc1.next();
	         int pay = sc2.nextInt();
	         int bonus = sc3.nextInt();
	         tm = new Temporary(pay, bonus);
	         tm.setName(name);
	         System.out.println(tm.name);
	      }
	      else {
	         System.out.println("����");
	      }
	   }

}
