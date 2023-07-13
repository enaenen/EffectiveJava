package test.providertest;

import java.util.ServiceLoader;

public class Client {
	public static void main(String[] args) {
		// 서비스 제공자 등록
		ServiceLoader<DatabaseServiceProvider> loader = ServiceLoader.load(
				DatabaseServiceProvider.class);

		// 제공자 중 하나의 객체를 사용
		DatabaseServiceProvider provider = loader.iterator().next();
		DatabaseService service = provider.getDatabaseService();
		service.connect();
	}

}
