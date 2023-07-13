package test.example42;

public class Cadet implements Seoul42Human {

	private String name;
	private int remainBlackhole;

	private Cadet(String name, int remainBlackhole) {
		this.name = name;
		this.remainBlackhole = remainBlackhole;
	}

	public static Cadet create(String name, int remainBlackhole) {
		return new Cadet(name, remainBlackhole);
	}

	@Override
	public void evaluated(Seoul42Human evaluator) {
		System.out.println("Cadet " + this.name + " evaluated by " + evaluator.getName());
	}

	@Override
	public void evaluate(Seoul42Human target) {
		System.out.println("target " + target.getName() + " evaluated by Cadet " + this.name);
	}

	@Override
	public String getName() {
		return this.name;
	}
}