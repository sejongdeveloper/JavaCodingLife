package oneAndOne;
import java.net.*;
import java.io.*;

class Receive implements Runnable {
	BufferedReader br;
	Socket client;
	public Receive(Socket client) throws IOException {
		br = new BufferedReader(new InputStreamReader(client.getInputStream()));
	}
	
	@Override
	public void run() {
		char[] buffer = new char[1024];
		try {
			while(true) {
				int	inputData = br.read(buffer);
				if(inputData == -1) {
					System.out.println(client.getLocalAddress() +  "종료"); 
					break; 
				}
				System.out.println(buffer);	
			}
			System.out.println("서버종료");
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(5000);
		System.out.println("서버시작");
		while(true) {
			Socket client = server.accept();
			System.out.println(client.getLocalAddress() + "연결승인");
			Thread thread = new Thread(new Receive(client));
			thread.start();			
		}
	}
	
	
}
