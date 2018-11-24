package User;

import java.util.ArrayList;

public class CEO extends User {
	private static ArrayList<Manager> listManager;

	public static ArrayList<Manager> getListManager() {
		return listManager;
	}

	public static void setListManager(ArrayList<Manager> listManager) {
		CEO.listManager = listManager;
	}

	public CEO(String userName, String passWord, String fullName, String userRule, Integer id) {
		CEO.fullName = fullName;
		CEO.userName = userName;
		CEO.passWord = passWord;
		CEO.userRule = userRule;
		CEO.idUser   = id;
	}
}
