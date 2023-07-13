package test.example43;


public class Member implements Seoul42Human {

	private String name;

	public Member(String name) {
		this.name = name;
	}
	public static Member create(String name) {
		return new Member(name);
	}


	@Override
	public String getName() {
		return this.name;
	}

	public void evaluated(test.example42.Seoul42Human evaluator) {
		System.out.println("Member " + this.name + "  evaluated by " + evaluator.getName());
	}

	@Override
	public void evaluate(Seoul42Human target) {
		System.out.println("target " + target.getName() + " evaluated by Member " + this.name);
	}

}
