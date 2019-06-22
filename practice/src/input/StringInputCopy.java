package input;

import java.util.Scanner;

public class StringInputCopy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[100];
		int index = -1;
		System.out.println("[사용방법] : 최대100줄 | 종료 : exit");
		System.out.println("============ 100줄 메모장 ============");
		do {
			index++; // 인덱스값 0부터 시작 ( -1 +1)			
			str[index] = sc.nextLine();
		}while(!str[index].equals("exit")); //"exit" 빠져나옴
		sc.close();
		
		System.out.println("======================================");
		
		for(String s : str) {
			if(s != null && !s.equals("exit")) // null, "exit" 제외한 모든 문자열 출력
			System.out.println(s);
		}
		
	}
}
