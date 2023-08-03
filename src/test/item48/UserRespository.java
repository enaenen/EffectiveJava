package test.item48;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserRespository {
	public static List<User> getUserData(){
		List<User> users = new ArrayList<>();
		for (int i = 0; i <= 1000; ++i){
			users.add(new User(Long.valueOf(i), "USER" + i, Double.valueOf(new Random().nextInt(1000*1000))));
		}
		return users;
	}

}
