package User;

import java.util.ArrayList;

public class CEO extends User{
	private static ArrayList<Manager> listManager;
	
	public static ArrayList<Manager> getListManager() {
		return listManager;
	}

	public static void setListManager(ArrayList<Manager> listManager) {
		CEO.listManager = listManager;
	}

	public CEO(String uN, String pW, String fN) {
		super(uN, pW, fN);
	}
}
