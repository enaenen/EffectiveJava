package test.item49;

import java.math.BigInteger;
import java.util.Objects;

public class Parameters {

	static class User {
		String name;
		User(){};
		User(String name){
			this.name = name;
		}
	}
	static void validator(User user){
		Objects.requireNonNull(user, "정신안차려?");
		Objects.requireNonNull(user.name, "이름이 없어? 말이 되냐?");
	}

	public static void main(String[] args) {
		User user = new User("김두한");
		try {
		validator(user);
		validator(null);
		}catch (NullPointerException e){
			System.out.println("e = " + e);
		}
		try {
		validator(new User());

		}catch (NullPointerException e){
			System.out.println("e = " + e);
		}
	}
}
