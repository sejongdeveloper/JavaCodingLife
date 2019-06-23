package sec17.ex05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RootController888 extends Application implements Initializable{
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				handleBtn1Action(event);
			}
		});
		
		btn2.setOnAction(event->handleBtn2Action(event));
		btn3.setOnAction(event->handleBtn3Action(event));
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("root888.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼1 클릭");
	}
	
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼2 클릭");
	}
	
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼3 클릭");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
