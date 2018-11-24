package Login;

import java.util.ArrayList;

import User.ManageUser;
import User.User;

public class LoginChecked {
	
	public static boolean checkPassword (String name, String password) {
		ArrayList<User> userList = ManageUser.getUserList();
		for (User user: userList) {
			if (user.getUserName().equals(name) && user.getPassWord().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
