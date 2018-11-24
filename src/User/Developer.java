package User;

public class Developer extends Employee {

	public Developer(String userName, String passWord, String fullName, String userRule, Integer id) {
		Developer.fullName = fullName;
		Developer.userName = userName;
		Developer.passWord = passWord;
		Developer.userRule = userRule;
		Developer.idUser   = id;
	}

}
