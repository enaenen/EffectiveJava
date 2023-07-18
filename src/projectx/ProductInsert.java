package projectx;

import java.sql.SQLException;
import java.util.Scanner;
import projectx.domain.Item;
import projectx.repository.ItemRepositoryV0;

public class ProductInsert {


	private static final String TERMINATE_COMMAND = "exit";
	private static final Scanner scanner = new Scanner(System.in);
	private static String command = "";

	enum Status {
		NAME, PRICE, STOCK, EXIT
	}

	private static void insertItem() {
		int price = 0;
		int stock = 0;

		Status currentStatus = Status.NAME;
		String name = null;

		Item newItem;

		System.out.println("상품 등록을 시작합니다.");
		while (currentStatus != Status.EXIT) {
			switch (currentStatus) {
				case NAME:
					System.out.println("[등록] 상품명을 입력해주세요.");
					command = scanner.next();
					if (command.equals(TERMINATE_COMMAND)) {
						if (isSureExit()) {
							currentStatus = Status.EXIT;
						}
						break;
					}
					if (command == null || command.isEmpty()) {
						System.out.println("상품명이 입력되지 않았습니다.");
						break;
					}
					name = command;
					currentStatus = Status.PRICE;
				case PRICE:
					System.out.println("[등록] 상품 가격을 입력해주세요.");
					command = scanner.next();
					try {
						price = Integer.parseInt(command);
					} catch (NumberFormatException e) {
						if (command.equals(TERMINATE_COMMAND)) {
							if (isSureExit()) {
								currentStatus = Status.EXIT;
							}
						}
						System.out.println("상품 가격이 잘못 입력되었습니다.");
						break;
					}
					if (price < 0) {
						System.out.println("상품 가격이 잘못 입력되었습니다.");
						break;
					}
					currentStatus = Status.STOCK;
				case STOCK:
					System.out.println("[등록] 상품 재고수량을 입력해주세요.");
					command = scanner.next();
					try {
						stock = Integer.parseInt(command);
					} catch (NumberFormatException e) {
						if (command.equals(TERMINATE_COMMAND)) {
							if (isSureExit()) {
								currentStatus = Status.EXIT;
							}
							break;
						}
						System.out.println("상품 재고수량이 잘못 입력되었습니다.");
						break;
					}
					if (stock < 0) {
						System.out.println("상품 재고수량이 잘못 입력되었습니다.");
						break;
					}

					currentStatus = Status.NAME;
					newItem = new Item(name, price, stock);
					System.out.println("newItem = " + newItem);
//					saveItem(newItem);
				case EXIT:
					break;
			}

		}


	}


	public static void main(String[] args) {
		System.out.println("상품 등록 시스템");
		System.out.println("종료를 뭔하시면 exit 을 입력해주세요.");

		insertItem();

		System.out.println("프로그램 종료");
		scanner.close();
	}

	private static boolean isSureExit() {
		System.out.println("종료하시겠습니까? Y / N");
		String answer = scanner.next().toLowerCase();
		return answer.equals("y") || answer.equals("yes") ? true : false;
	}

}
