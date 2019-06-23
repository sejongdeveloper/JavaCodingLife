package sec17.ex03;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain858 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hBox = new HBox(); // HBox �����̳� ����
		hBox.setPadding(new Insets(10)); //���� ���� ����
		hBox.setSpacing(10); // ��Ʈ�� ���� ���� ���� ����
		
		TextField textField = new TextField(); // TextField ��Ʈ�� ����
		textField.setPrefWidth(200); // TextField ��Ʈ�� ��ġ
		
		Button button = new Button(); // Button ��Ʈ�� ����
		button.setText("Ȯ��"); // Button ���� ����
		
		ObservableList list = hBox.getChildren(); // HBox�� ObservableList ���
		list.add(textField); // TextField ��Ʈ�� ��ġ
		list.add(button); // Button�� ��Ʈ�� ��ġ
		
		Scene scene = new Scene(hBox); // ��� ����
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
