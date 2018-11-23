package User;

public abstract class User {
	private static String userName;
	private static String passWord;
	private static String fullName;
	
	public User() {
		User.userName = null;
		User.passWord = null;
		User.fullName = null;
	}
	
	public User(String uN, String pW, String fN) {
		User.userName = uN;
		User.passWord = pW;
		User.fullName = fN;
	}
	
	//Setters and Getters
	public static String getUserName() {
		return userName;
	}
	public static String getPassWord() {
		return passWord;
	}
	public static String getFullName() {
		return fullName;
	}

	
	
}
