package projectx.service;

import java.sql.SQLException;
import projectx.domain.Item;
import projectx.repository.ItemRepositoryV0;

public class ItemService {
	private static final ItemRepositoryV0 itemRepositoryV0 = new ItemRepositoryV0();

	private void saveItem(Item item) {
		try {
			itemRepositoryV0.save(item);
		} catch (SQLException e) {
			System.out.println("error = " + e);
		}
	}


}
