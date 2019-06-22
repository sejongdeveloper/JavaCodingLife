package testNet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 5000);
		System.out.println("승인요청");
//		OutputStream os = s.getOutputStream(); // 소켓출력 스트림
//		OutputStreamWriter osw = new OutputStreamWriter(os); // 문자전환
//		BufferedWriter bw = new BufferedWriter(osw); // 성능향상
		// 위 3줄을 합침
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bw.write("된다! \r\n"); //Thread 일때는 블로킹됨 , readLine()을 위해 개행(\r\n)을 해줌
		bw.flush(); // write는 무조건 끝날때 flush
	}
}
