package test.providertest;

public class MySQLDatabaseService implements DatabaseService {

	@Override
	public void connect() {
		System.out.println("Connecting to MySQL database...");
	}

}
