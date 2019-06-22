package ex01.file;

import java.io.*;

public class InputEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		while(true) {
			String inputData = br.readLine();
			if(inputData == null) break;
			System.out.println(inputData);
		}
		br.close();
		System.out.println("load");
		
	}
}
