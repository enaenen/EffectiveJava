package test.item26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCacheTest {

	@Test
	void RAW_TEST(){
		MyCache cache = MyCache.newInstance();
		cache.put("A", "B");
		cache.put(1, 2);

		assertEquals(2, cache.size());
		assertEquals("B", cache.get("A"));
		assertEquals(2, cache.get(1));

	}


}