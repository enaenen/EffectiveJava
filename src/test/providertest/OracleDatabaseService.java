package test.providertest;

public class OracleDatabaseService implements DatabaseService {

	@Override
	public void connect() {
		System.out.println("Connecting to Oracle database...");
	}

}
