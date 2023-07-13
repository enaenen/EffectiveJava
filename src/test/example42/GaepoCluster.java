package test.example42;

public class GaepoCluster {

	public static void main(String[] args) {
		Seoul42Human cadet1 = Cadet.create("daewoole", 123);
		Seoul42Human member1 = Member.create("jpark2");

		member1.evaluate(cadet1);
		cadet1.evaluate(member1);
	}
}
