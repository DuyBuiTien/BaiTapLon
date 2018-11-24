package MyFX;

import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;

public class MyPasswordField {
	private static Pane root;
	private static PasswordField passWord;
	
	public MyPasswordField(Pane root) {
		MyPasswordField.root = root;
		passWord = new PasswordField();
	}
	
	public void Init (String s, double width, double height, double x, double y) {
		passWord.setPromptText(s);
		passWord.setLayoutX(x);
		passWord.setLayoutY(y);
		passWord.setPrefSize(width, height);
		root.getChildren().add(MyPasswordField.passWord);
	}

	public static Pane getRoot() {
		return root;
	}

	public static PasswordField getPassWord() {
		return passWord;
	}
}
