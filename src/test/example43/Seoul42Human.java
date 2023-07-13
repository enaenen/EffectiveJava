package test.example43;


public interface Seoul42Human {
	static Cadet cadet(String name, int remainBlackhole) {
		return new Cadet(name, remainBlackhole);
	}
	static Member member(String name) {
		return new Member(name);
	}
	void evaluate(Seoul42Human target);
	String getName();
}