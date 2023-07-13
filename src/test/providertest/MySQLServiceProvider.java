package test.providertest;


public class MySQLServiceProvider implements DatabaseServiceProvider {

	public DatabaseService getDatabaseService() {
		return new MySQLDatabaseService();
	}
}
