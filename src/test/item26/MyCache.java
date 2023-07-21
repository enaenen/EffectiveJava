package test.item26;

import java.util.HashMap;

public class MyCache<K, V> {
		private HashMap<K, V> map = new HashMap<K, V>();
		private MyCache() {
		}
		public static <K, V> MyCache<K, V> newInstance() {
			return new MyCache<K, V>();
		}

		public void put(K key, V value) {
			map.put(key, value);
		}
		public V get(K key) {
			return map.get(key);
		}
		public void clear() {
			map.clear();
		}
		public int size() {
			return map.size();
		}
}
