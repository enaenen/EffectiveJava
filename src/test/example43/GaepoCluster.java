package test.example43;


public class GaepoCluster {

	public static void main(String[] args) {
		Seoul42Human daewoole = Seoul42Human.cadet("daewoole", 123);
		Seoul42Human jpark2 = Seoul42Human.member("jpark2");

		jpark2.evaluate(daewoole);
		daewoole.evaluate(jpark2);
	}
}

