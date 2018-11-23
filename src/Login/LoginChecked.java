package Login;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import User.Employee;
import User.User;

public class LoginChecked {
	private static ArrayList<User> listUser;
	
	public LoginChecked() {
		LoginChecked.listUser = new ArrayList<>();
	}
	
	public boolean checkPassword (String path, String name, String password) throws IOException {
		File file = new File(path);
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] userInfor = line.split("-");
			if (userInfor[0].equals(name)) {
				if (userInfor[1].equals(password)) {
					int i = Integer.parseInt(userInfor[2]);
					switch(i) {
					case 1:
						
					}
				}
			}
		}
		
		
	}
	
	
	public ArrayList<User> getListUser() {
		return LoginChecked.listUser;
	}
}
