package test.generic.genericmethod;

public class GenericMethods {
	class Printer<T> {
		public <T> void printClassType(T e) {
			System.out.println(e.getClass().getSimpleName());
		}
	}
	public static void main(String[] args) {
		GenericMethods m = new GenericMethods();
		Printer<String> printer = m.new Printer<String>();
		printer.printClassType(1234);
		printer.printClassType(3.14);
		printer.printClassType("HI");
	}
}
