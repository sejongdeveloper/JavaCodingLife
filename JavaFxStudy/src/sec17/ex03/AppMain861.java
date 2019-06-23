package sec17.ex03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class AppMain861 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		//패딩 설정 ----------------------------
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(50, 10, 10, 50));
		Button button = new Button();
		button.setPrefSize(100, 100);
		
		//마진 설정-----------------------------
//		HBox hBox = new HBox();
//		Button button = new Button();
//		button.setPrefSize(100, 100);
//		hBox.setMargin(button, new Insets(10, 10, 50, 50));
		
		hBox.getChildren().add(button);
		
		Scene scene = new Scene(hBox);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
