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
		HBox hBox = new HBox(); // HBox 컨테이너 생성
		hBox.setPadding(new Insets(10)); //안쪽 여백 설정
		hBox.setSpacing(10); // 컨트롤 간의 수평 간격 설정
		
		TextField textField = new TextField(); // TextField 컨트롤 생성
		textField.setPrefWidth(200); // TextField 컨트롤 배치
		
		Button button = new Button(); // Button 컨트롤 생성
		button.setText("확인"); // Button 글자 생성
		
		ObservableList list = hBox.getChildren(); // HBox의 ObservableList 얻기
		list.add(textField); // TextField 컨트롤 배치
		list.add(button); // Button의 컨트롤 배치
		
		Scene scene = new Scene(hBox); // 장면 생성
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
