package testNet;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5000);
		System.out.println("��������");
		Socket s = ss.accept();
		System.out.println("��û����");
		
		InputStream is = s.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		DataInputStream dis = new DataInputStream(bis);
		
		String msg = dis.readUTF(dis);
		System.out.println(msg);
	}
}
