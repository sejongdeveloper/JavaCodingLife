package testNet;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BufferVsInput {
	public static void main(String[] args) throws IOException {
		// 둘다 배열 안쓰면 buffer가 훨씬 좋지만
		// 둘다 배열을 쓰면 input이 조금 더 좋다
		InputStream is = new FileInputStream("copy.jpg");
		byte[] buffer = new byte[8192];
		int count;
		long start = System.nanoTime();
		while(true) {
//			count = is.read();
			count = is.read(buffer);
			if(count == -1) break;
		}
		long end = System.nanoTime();
		System.out.println(end - start);
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy.jpg"));
		int count2;
		byte[] buffer2 = new byte[8192];
		long start2 = System.nanoTime();
		while(true) {
//			count2 = bis.read();
			count2 = bis.read(buffer2);
			if(count2 == -1) break;
		}
		long end2 = System.nanoTime();
		System.out.println(end2 - start2);
		
		
	}
}
