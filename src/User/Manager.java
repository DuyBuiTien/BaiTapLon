package User;

import java.util.ArrayList;

public class Manager extends User{
	
	private static ArrayList<Employee> listEmployee;
	private static int idManager;

	public Manager(String uN, String pW, String fN, int id) {
		super(uN, pW, fN);
		Manager.idManager = id;
	}
	
	public static ArrayList<Employee> getListEmployee() {
		return listEmployee;
	}


	public static void setListEmployee(ArrayList<Employee> listEmployee) {
		Manager.listEmployee = listEmployee;
	}

	public static int getIdManager() {
		return idManager;
	}

	public static void setIdManager(int idManager) {
		Manager.idManager = idManager;
	}
	
}
