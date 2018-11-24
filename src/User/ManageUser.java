package User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageUser {
	private static ArrayList<User> userList;
	
	public ManageUser() {
		ManageUser.userList = new ArrayList<>();
	}
	
	public static void readFromFile (String path) throws FileNotFoundException {
		File file = new File(path);
		Scanner scan = new Scanner(file);
		scan.nextLine();
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] split = line.split("-");
			for (int i = 0; i < split.length; i++) {
				System.out.println(split[i]);
			}
			String userName = split[2];
			String passWord = split[3];
			String fullName = split[1];
			String userRule = split[4];
			int id = Integer.parseInt(split[0]);
			switch(userRule) {
			case "CEO":
				CEO ceo = new CEO(userName, passWord, fullName, userRule, id);
				System.out.println(ceo.getFullName() + " " + ceo.getPassWord());
				userList.add(ceo);
				break;
			case "Manager":
				Manager manager = new Manager(userName, passWord, fullName, userRule, id);
				userList.add(manager);
				break;
			case "Developer":
				Developer developer = new Developer(userName, passWord, fullName, userRule, id);
				userList.add(developer);
				break;
			case "Tester":
				Tester tester = new Tester(userName, passWord, fullName, userRule, id);
				userList.add(tester);
				break;
			}
		}
		scan.close();
	}

//	public void addUserList (String userName, String passWord, String fullName, String userRule, int id) {
//		switch(userRule) {
//		case "CEO":
//			User ceo = new CEO(userName, passWord, fullName, userRule, id);
//			System.out.println(ceo.getFullName() + " " + ceo.getPassWord());
//			getUserList().add(ceo);
//			break;
//		case "Manager":
//			Manager manager = new Manager(userName, passWord, fullName, userRule, id);
//			getUserList().add(manager);
//			break;
//		case "Developer":
//			Developer developer = new Developer(userName, passWord, fullName, userRule, id);
//			getUserList().add(developer);
//			break;
//		case "Tester":
//			Tester tester = new Tester(userName, passWord, fullName, userRule, id);
//			getUserList().add(tester);
//			break;
//		}
//	}

	public static ArrayList<User> getUserList() {
		return ManageUser.userList;
	}

	public static void setUserList(ArrayList<User> userList) {
		ManageUser.userList = userList;
	}

}
