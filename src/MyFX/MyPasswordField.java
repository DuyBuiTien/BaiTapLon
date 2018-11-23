package MyFX;

import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;

public class MyPasswordField {
	@SuppressWarnings("unused")
	private static Pane root;
	private static PasswordField passWord;
	
	public MyPasswordField(Pane root) {
		MyPasswordField.root = root;
		passWord = new PasswordField();
	}
	
	public void Init (String s, double width, double height, double x, double y) {
		MyPasswordField.passWord.setPromptText(s);
		MyPasswordField.passWord.setLayoutX(x);
		MyPasswordField.passWord.setLayoutY(y);
		MyPasswordField.passWord.setPrefSize(width, height);
		MyPasswordField.root.getChildren().add(MyPasswordField.passWord);
	}

	public static Pane getRoot() {
		return root;
	}

	public static PasswordField getPassWord() {
		return passWord;
	}
}
