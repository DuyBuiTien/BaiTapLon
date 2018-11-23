package User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageUser {
	private static ArrayList<User> userList;
	
	public static void addUserList(String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] userInfor = line.split("-");
			String id = userInfor[0];
			switch(id) {
			case "0":
				CEO ceo = new CEO(userInfor[1], userInfor[2], userInfor[3]);
				break;
			case "1":
				Manager manager = new Manager(userInfor[2], userInfor[3], userInfor[4], Integer.parseInt(userInfor[1]));
				CEO.getListManager().add(manager);
				break;
			case "2":
				if (userInfor[1].equals("I")) {
					Developer dev = new Developer(userInfor[2], userInfor[3], userInfor[4]);
					
				}
			
			}
			
				
		}
	}
	
	
	public static ArrayList<User> getUserList() {
		return userList;
	}

	public static void setUserList(ArrayList<User> userList) {
		ManageUser.userList = userList;
	}
	
}
