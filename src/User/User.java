package User;

public abstract class User {
	protected static Integer idUser;
	protected static String userName;
	protected static String passWord;
	protected static String fullName;
	protected static String userRule;

	public User() {
		User.idUser   = null;
		User.userName = null;
		User.passWord = null;
		User.fullName = null;
		User.userRule = null;
	}

	public User(String userName, String passWord, String fullName, String userRule, Integer id) {
		User.userName = userName;
		User.passWord = passWord;
		User.fullName = fullName;
		User.userRule = userRule;
		User.idUser   = id;
	}

	// Setters and Getters
	public String getUserName() {
		return userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public String getFullName() {
		return fullName;
	}

	public static String getUserRule() {
		return userRule;
	}

}
