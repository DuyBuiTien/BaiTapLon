package User;

import java.util.ArrayList;

public class Manager extends User {
	
	private static ArrayList<Employee> employeeList;

	public Manager(String userName, String passWord, String fullName, String userRule, Integer id) {
		Manager.fullName = fullName;
		Manager.userName = userName;
		Manager.passWord = passWord;
		Manager.userRule = userRule;
		Manager.idUser   = id;
	}

	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(ArrayList<Employee> employeeList) {
		Manager.employeeList = employeeList;
	}

}
