package testNet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx3 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 5000);
		System.out.println("클라이언트 시작");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg;
		msg = sc.readLine() + "\r\n"; // 키보드로부터 입력받음
		bw.write(msg); // 서버한테 보냄
		bw.flush();
		System.out.println(br.readLine()); // 서버한테 받은 문자열
		System.out.println("클라이언트 종료");
	}
}
