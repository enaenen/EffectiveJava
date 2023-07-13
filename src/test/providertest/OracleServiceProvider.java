package test.providertest;


public class OracleServiceProvider implements DatabaseServiceProvider {
	public DatabaseService getDatabaseService() {
		return new OracleDatabaseService();
	}

}
