package projectx;

import java.sql.SQLException;
import java.util.Scanner;
import projectx.domain.Item;
import projectx.repository.ItemRepositoryV0;

public class ProductInsert {

	private static final ItemRepositoryV0 itemRepositoryV0 = new ItemRepositoryV0();

	private static final String TERMINATE_COMMAND = "exit";
	private static final Scanner scanner = new Scanner(System.in);
	private static String command;


	private static void saveItem(Item item) {
		try {
			itemRepositoryV0.save(item);
		} catch (SQLException e) {
			System.out.println("error = " + e);
		}
	}

	private static void insertItem() {
		int status = 0;
		String name = null;
		int price = 0;
		int stock = 0;
		Item newItem;

		System.out.println("상품 등록을 시작합니다.");
		while (status != -1) {
			switch (status) {
				case 0:
					System.out.println("상품명을 입력해주세요.");
					command = scanner.next();
					if (command.equals(TERMINATE_COMMAND)) {
						if (isSureExit()) {
							status = -1;
						}
						break;
					}
					if (command == null || command.isEmpty()) {
						System.out.println("상품명이 입력되지 않았습니다.");
						break;
					}
					name = command;
					status = 1;
				case 1:
					System.out.println("상품 가격을 입력해주세요.");
					command = scanner.next();
					try {
						price = Integer.parseInt(command);
					} catch (NumberFormatException e) {
						if (command.equals(TERMINATE_COMMAND)) {
							status = -1;
						}
						System.out.println("상품 가격이 잘못 입력되었습니다.");
						break;
					}
					if (price < 0) {
						System.out.println("상품 가격이 잘못 입력되었습니다.");
						break;
					}
					status = 2;
				case 2:
					System.out.println("상품 재고를 입력해주세요.");
					command = scanner.next();
					try {
						stock = Integer.parseInt(command);

					} catch (NumberFormatException e) {
						if (command.equals(TERMINATE_COMMAND)) {
							status = -1;
							break;
						}
						System.out.println("상품 재고가 잘못 입력되었습니다.");
						break;
					}
					if (stock < 0) {
						System.out.println("상품 재고가 잘못 입력되었습니다.");
						break;
					}

					status = 0;
					newItem = new Item(name, price, stock);
					System.out.println("newItem = " + newItem);
//					saveItem(newItem);
				case -1:
					break;
			}

		}


	}


	public static void main(String[] args) {
		System.out.println("상품 등록 시스템");
		System.out.println("종료를 뭔하시면 exit 을 입력해주세요.");
		command = "";

		while (!command.equals(TERMINATE_COMMAND)) {
			insertItem();
			if (command.equals(TERMINATE_COMMAND) && isSureExit()) {
				break;
			} else {
				command="";
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

	private static boolean isSureExit() {
		System.out.println("종료하시겠습니까? Y / N");
		String answer = scanner.next().toLowerCase();
		return answer.equals("y") || answer.equals("yes") ? true : false;
	}

}
