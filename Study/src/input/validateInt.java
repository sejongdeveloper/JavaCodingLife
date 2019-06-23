package input;

import java.util.Scanner;

//int num 유효성 검사
public class validateInt {
	public static void main(String[] args) {
		int num = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력>> ");

		 while (true) {
			while (!sc.hasNextInt()) { // int형 제외한 나머지 타입 무한루프
				sc.next();
				System.out.println("숫자를 잘못 입력했습니다.");
				System.out.print("다시 입력>> ");
			} // while end;
			
			num = sc.nextInt();
			if (num < 0) { // 음수 일때
				System.out.println("음수입니다.");
				System.out.print("다시 입력>> ");
				continue; //바깥 while 조건으로 이동
				
			}else { // 양수 일때
				sc.close();
				break;
			}// if end
			
		} // while end
		System.out.println("숫자 : " + num);
	} // main end
}
