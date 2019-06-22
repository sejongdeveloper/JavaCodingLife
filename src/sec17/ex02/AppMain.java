package sec17.ex02;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {
	public AppMain() {
		System.out.println(Thread.currentThread().getName() + ": AppMain() 호출");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": init() 호출");
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + ": start() 호출");
		primaryStage.show(); //윈도우 보여주기
		
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": stop() 호출");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": main() 호출");
		launch(args); // AppMain 객체 생성 및 메인 윈도우 생성
	}
}
