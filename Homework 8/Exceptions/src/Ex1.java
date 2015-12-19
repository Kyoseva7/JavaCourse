
public class Ex1 {
	
	private String username;
	private String password;
	
	
	
	public Ex1() {
		super();
	}

	public Ex1(String username, String password) {
		super();
		setUsername(username);
		setPassword(password);
	}

	public void setUsername(String username) {
		if(username.length() >= 5 && username.contains("@") && username.contains(".")) {
			this.username = username;
		} else {
			throw new IllegalArgumentException("Invalid username");
		}
	}
	
	public String getEmail() {
		return username;
	}
	private boolean checkForInt(String password) {
		for (int i = 0; i < password.length(); i++) {
			switch (password.charAt(i)) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					return true;
			}
		}
		return false;
	}
	
	private boolean checkForInt2(String password) {
		for (int i = 0; i < password.length(); i++) {
			if(Character .isDigit(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	
	public void setPassword(String password) {
		if(password.length() > 5 && checkForInt(password)) {
			this.password = password;
		} else {
			throw new IllegalArgumentException("Invalid username");
		}
	}
	
	public String getPassword() {
		return password;
	}
		

	public static void main(String[] args) {
		
		

	}

}
