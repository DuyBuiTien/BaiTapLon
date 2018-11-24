package MyFX;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class MyTextField {
	private static Pane root;
	private static TextField textField;
	
	public MyTextField(Pane root) {
		MyTextField.textField = new TextField();
		MyTextField.root = root;
	}
	
	public void Init(String name, double prefWidth, double prefHeight, double x, double y) {
		MyTextField.textField.setPromptText(name);
		MyTextField.textField.setLayoutX(x);
		MyTextField.textField.setLayoutY(y);
		MyTextField.textField.setPrefSize(prefWidth, prefHeight);
		MyTextField.root.getChildren().add(MyTextField.textField);
	}
	
	public Pane getRoot() {
		return root;
	}
	public void setRoot(Pane root) {
		MyTextField.root = root;
	}
	public TextField getTextField() {
		return textField;
	}
	public void setTextField(TextField textField) {
		MyTextField.textField = textField;
	}
	
	
}
