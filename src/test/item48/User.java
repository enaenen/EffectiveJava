package test.item48;

public class User {
	private Long id;
	private String name;
	private double exp;

	public User(Long id, String name, double exp) {
		this.id = id;
		this.name = name;
		this.exp = exp;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getExp() {
		return exp;
	}
}
