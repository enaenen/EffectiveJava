package test.singletons;

public class Main {
	public static void main(String[] args) {
		/*
		SingletonFactory<String> stringfact1 = SingletonFactory.getInstance();
		stringfact1.setInstanceValue("ANG, KIMOCCCHI");
		SingletonFactory<String> stringfact2 = SingletonFactory.getInstance();
		System.out.println("stringfact2 = " + stringfact2);
		System.out.println("stringfact2.getInstanceValue() = " + stringfact2.getInstanceValue());
		System.out.println("stringfact1 = " + stringfact1);
		System.out.println("stringfact1.getInstanceValue() = " + stringfact1.getInstanceValue());


		SingletonFactory<Integer> intFact1 = SingletonFactory.getInstance();
		intFact1.setInstanceValue(42);
		SingletonFactory<Integer> intFact2 = SingletonFactory.getInstance();
		System.out.println(intFact2.getInstanceValue());  // 42
		System.out.println("intFact2 = " + intFact2);
		System.out.println("intFact2 = " + intFact2.getInstanceValue());
		System.out.println("intFact1 = " + intFact1);
		System.out.println("intFact1 = " + intFact1.getInstanceValue());

		System.out.println(stringfact1.getInstanceValue());
		 */
		EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
		EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;

		System.out.println("enumSingleton1.equals() = " + enumSingleton1.equals(enumSingleton2));

		System.out.println("enumSingleton1.hashCode() = " + enumSingleton1.hashCode());
		System.out.println("enumSingleton2.hashCode() = " + enumSingleton2.hashCode());
	}
}
