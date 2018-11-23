package MyFX;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class MyLabel {
	private static Pane root;
	private static Label label;
	
	public MyLabel(Pane root) {
		MyLabel.root = root;
		label = new Label();
	}
	
	public void Init(String name, double width, double height, double x, double y) {
		label.setText(name);
		label.setPrefSize(width, height);
		label.setLayoutX(x);
		label.setLayoutY(y);
		MyLabel.root.getChildren().add(label);
	}

	public static Pane getRoot() {
		return root;
	}

	public static Label getLabel() {
		return label;
	}
}
