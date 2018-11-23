package MainProgram;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class PrimaryScene {
	private static final double PREF_WIDTH = 400;
	private static final double PREF_HEIGHT = 600;
	private static AnchorPane rootLogin;
	private static AnchorPane rootManagement;
	private static Scene scene;
	
	public static void Init() {
		PrimaryScene.rootLogin = new AnchorPane();
		PrimaryScene.rootManagement = new AnchorPane();
		PrimaryScene.scene = new Scene(rootLogin, PREF_HEIGHT, PREF_WIDTH);
	}
	
	public static void setFalseVisibleLoginPane() {
		PrimaryScene.getRootLogin().setVisible(false);
		PrimaryScene.getRootManagement().setVisible(true);	
	}
	
	//Getters and Setters
	public static AnchorPane getRootManagement() {
		return PrimaryScene.rootManagement;
	}
	public static AnchorPane getRootLogin() {
		return PrimaryScene.rootLogin;
	}
	
	public static Scene getScene() {
		return PrimaryScene.scene;
	}
}
