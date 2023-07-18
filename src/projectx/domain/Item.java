package projectx.domain;

public class Item {
	private int code;
	private String name;
	private int price;
	private int stock;

	public Item() {
	}

	@Override
	public String toString() {
		return "Item{" +
				"code=" + code +
				", name='" + name + '\'' +
				", price=" + price +
				", stock=" + stock +
				'}';
	}

	public Item(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}



	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
}