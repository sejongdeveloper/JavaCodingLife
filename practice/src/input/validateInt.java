package input;

import java.util.Scanner;

//int num ��ȿ�� �˻�
public class validateInt {
	public static void main(String[] args) {
		int num = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�>> ");

		 while (true) {
			while (!sc.hasNextInt()) { // int�� ������ ������ Ÿ�� ���ѷ���
				sc.next();
				System.out.println("���ڸ� �߸� �Է��߽��ϴ�.");
				System.out.print("�ٽ� �Է�>> ");
			} // while end;
			
			num = sc.nextInt();
			if (num < 0) { // ���� �϶�
				System.out.println("�����Դϴ�.");
				System.out.print("�ٽ� �Է�>> ");
				continue; //�ٱ� while �������� �̵�
				
			}else { // ��� �϶�
				sc.close();
				break;
			}// if end
			
		} // while end
		System.out.println("���� : " + num);
	} // main end
}
