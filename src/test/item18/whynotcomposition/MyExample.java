package test.item18.whynotcomposition;

import java.util.Hashtable;

class MyProperties extends Hashtable {
	public Object setProperty(String key, String value) {
		return put(key, value);
	}
	public String getProperty(String key) {
		return (String) get(key);
	}
}
public class MyExample {

}
