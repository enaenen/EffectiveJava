package test;

import java.util.HashMap;
import java.util.Map;

public class Effective {
	class User {
		private String name;

		public User(String name) {
			this.name = name;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof User) {
				return ((User) obj).name.equals(this.name);
			}
			return false;
		}
	}
	class UserFactory {
		private static Map<String, User> userMap = new HashMap<>();

		public static User getUser(String name) {
			User user = userMap.get(name);
			if (user == null) {
				user = new Effective().new User(name);
				userMap.put(name, user);
			}
			return user;
		}
	}
	public static void main(String[] args) {
		User user1 = new Effective().new User("Space");
		User user2 = new Effective().new User("Space");
		System.out.println("user1.equals(user2) = " + user1.equals(user2));
		System.out.println("user1 == user2 = " + (user1 == user2));
		System.out.println("====================================================");
		User user3 = UserFactory.getUser("Space");
		User user4 = UserFactory.getUser("Space");
		System.out.println("user3.equals(user4) = " + user3.equals(user4));
		System.out.println("(user3 == user4)  = " + (user3 == user4));
	}

}

