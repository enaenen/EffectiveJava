package test.item18.whynotcomposition;

import java.util.Properties;

class Person {
	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}
public class PropertiesExample {

	public static void main(String[] args) {
		Properties properties = new Properties();
		Person person = new Person(1234, "wchae");

		properties.setProperty("name",person.getName());
		///?
		properties.put("name", person);


		// hashtable 동작
		System.out.println("properties.get(\"name\") = " + properties.get("name"));
		// Properties 동작
		System.out.println("properties.getProperty() = " + properties.getProperty("name"));

	}

}
