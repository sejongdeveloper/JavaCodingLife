package sec17.ex04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain873_882 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
//		Parent root = FXMLLoader.load(getClass().getResource("root875.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("root876.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("root878.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("root879.fxml"));
//		Parent root = FXMLLoader.load(getClass().getResource("root881.fxml"));
		Parent root = FXMLLoader.load(getClass().getResource("root882.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
