package Login;

import MainProgram.PrimaryScene;
import javafx.scene.Scene;

public class ManageScene {
	public static Scene ManagementScene() {
		PrimaryScene.setFalseVisibleLoginPane();
		return PrimaryScene.getScene();
	}
}
