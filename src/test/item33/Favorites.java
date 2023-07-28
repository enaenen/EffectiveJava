package test.item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {

	private Map<Class<?>, Object> favorites = new HashMap<>();

	public <T> void putFavorite(Class<T> type, T instance) {
		favorites.put(Objects.requireNonNull(type), instance);
	}

	public <T> void putSafeFavorite(Class<T> type, T instance) {
		favorites.put(Objects.requireNonNull(type), type.cast(instance));
	}

	public <T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
	}

	public static void main(String[] args) {
		Favorites f = new Favorites();
		f.putFavorite(String.class, "JAVA");
		f.putFavorite(Integer.class, 0xcafebabe);
		f.putFavorite(Class.class, Favorites.class);

		// 에러
//		f.putFavorite((Class)Integer.class, "ASDF");

		String favoriteString = f.getFavorite(String.class);
		int favoriteInteger = f.getFavorite(Integer.class);
		Class<?> favoriteClass = f.getFavorite(Class.class);

		System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
	}

}
