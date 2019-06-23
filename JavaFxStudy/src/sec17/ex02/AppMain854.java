package sec17.ex02;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain854 extends Application {
	public AppMain854() {
		System.out.println(Thread.currentThread().getName() + ": AppMain() ȣ��");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": init() ȣ��");
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + ": start() ȣ��");
		primaryStage.show(); //������ �����ֱ�
		
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": stop() ȣ��");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": main() ȣ��");
		launch(args); // AppMain ��ü ���� �� ���� ������ ����
	}
}