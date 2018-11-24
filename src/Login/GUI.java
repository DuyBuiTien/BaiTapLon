package Login;

import java.io.FileNotFoundException;

import javax.swing.text.html.CSS;
import MainProgram.PrimaryScene;
import MyFX.MyLabel;
import MyFX.MyPasswordField;
import MyFX.MyTextField;
import User.ManageUser;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class GUI {
	private static final double PREF_WIDTH_USER = 90.0;
	private static final double PREF_HEIGHT_USER = 31.0;
	private static final double X_USER = 321.0;
	private static final double Y_USER = 33.0;
	
	private static final double PREF_WIDTH_NAME = 227.0;
	private static final double PREF_HEIGHT_NAME = 31.0;
	private static final double X_NAME = 321.0;
	private static final double Y_NAME = 73.0;
	
	private static final double PREF_WIDTH_PASS = 90.0;
	private static final double PREF_HEIGHT_PASS = 31.0;
	private static final double X_PASS = 321.0;
	private static final double Y_PASS = 117.0;
	
	private static final double PREF_WIDTH_WORD = 227.0;
	private static final double PREF_HEIGHT_WORD = 31.0;
	private static final double X_WORD = 321.0;
	private static final double Y_WORD = 148.0;
	
	private static final double PREF_WIDTH_LOGIN = 90.0;
	private static final double PREF_HEIGHT_LOGIN = 31.0;
	private static final double X_LOGIN = 378.0;
	private static final double Y_LOGIN = 200.0;
	
	private static int count = 0;
	private static final int MAX_LOGIN_WRONG = 3;

	public static Scene LoginScene() throws FileNotFoundException {
		PrimaryScene.Init();
		ManageUser.readFromFile("E:/Java/Eclipse Project/src/User.txt");
		
		//Initial username Label
		MyLabel userName = new MyLabel(PrimaryScene.getRootLogin());
		userName.Init("Username", PREF_WIDTH_USER, PREF_HEIGHT_USER, X_USER, Y_USER);
		
		//Initial username TextField
		MyTextField user = new MyTextField(PrimaryScene.getRootLogin());
		user.Init("Username...",PREF_WIDTH_NAME, PREF_HEIGHT_NAME, X_NAME, Y_NAME);
		
		//Initial password Label
		MyLabel passWord = new MyLabel(PrimaryScene.getRootLogin());
		passWord.Init("Password", PREF_WIDTH_PASS, PREF_HEIGHT_PASS, X_PASS, Y_PASS);

		//Initial password PasswordField
		MyPasswordField pass = new MyPasswordField(PrimaryScene.getRootLogin());
		pass.Init("Password...", PREF_WIDTH_WORD, PREF_HEIGHT_WORD, X_WORD, Y_WORD);
		
		
		//Initial login Button
		Button loginButton = new Button();
		loginButton.setText("Login");
		loginButton.setLayoutX(X_LOGIN);
		loginButton.setLayoutY(Y_LOGIN);
		loginButton.setPrefSize(PREF_WIDTH_LOGIN, PREF_HEIGHT_LOGIN);

			loginButton.setOnAction(new EventHandler<ActionEvent>() {
			       @Override
			       public void handle(ActionEvent event) {
			    	   if (LoginChecked.checkPassword(user.getTextField().getText(), pass.getPassWord().getText())) {
			    		   ManageScene.ManagementScene();			    		   
			    	   }
			    	   else {
			    		   System.out.println("Wrong");
			    		   count++;
			    		   if (count == MAX_LOGIN_WRONG) {
			    			   System.exit(0);
			    			   System.out.println("System has been stopped.");
			    		   }
			    	   }
			       }
			});
		PrimaryScene.getRootLogin().getChildren().add(loginButton);
		
		
		return PrimaryScene.getScene();
	}
	

}
