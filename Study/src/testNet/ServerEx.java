package testNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ServerEx {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket();
		ss.bind(new InetSocketAddress("localhost", 5000));
		System.out.println("서버 시작");
		
		Socket s = ss.accept();
		System.out.println("승인수락");
		/////////// Reader /////////////
		InputStream is = s.getInputStream(); // 소켓 입력스트림
		InputStreamReader isr = new InputStreamReader(is); // reader 전환(문자전용)
		BufferedReader br = new BufferedReader(isr); // buffer 전환(성능향상)
		
		try {
			while(true) { 
				System.out.println("aa " + br.readLine()); // \r\n이 될대까지 읽음
			}
		} catch(SocketException e) {
			System.out.println("클라이언트 종료");
		}
	}
}
