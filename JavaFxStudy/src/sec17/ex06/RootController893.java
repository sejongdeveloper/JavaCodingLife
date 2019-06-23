package sec17.ex06;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class RootController893 extends Application implements Initializable {
	@FXML private TextArea textArea1;
	@FXML private TextArea textArea2;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(textArea1.getText());
		Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root893.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
