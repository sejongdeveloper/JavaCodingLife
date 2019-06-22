package ex01.file;

import java.io.*;

public class OutputEx {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("sample.txt", true);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("============메모장 기능 =============");
		while(true) {
			String inputData = br.readLine();
			if(inputData.equalsIgnoreCase("exit")) break;
			inputData += "\r\n";
			os.write(inputData.getBytes());
		}
		os.close();
		br.close();
		System.out.println("save");	
	}
}
