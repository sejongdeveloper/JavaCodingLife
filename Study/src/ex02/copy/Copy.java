package ex02.copy;

import java.io.*;

public class Copy {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("tt.jpg");
		OutputStream os = new FileOutputStream("copy.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		long start = System.currentTimeMillis();
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			bos.write(inputData);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("copy : " + (end - start));
	}
}
