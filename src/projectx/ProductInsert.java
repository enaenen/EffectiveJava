package projectx;

import java.sql.SQLException;
import java.util.Scanner;
import projectx.domain.Item;
import projectx.repository.ItemRepositoryV0;

public class ProductInsert {

	private static final ItemRepositoryV0 itemRepositoryV0 = new ItemRepositoryV0();

	private static final String TERMINATE_COMMAND = "exit";
	private static final Scanner scanner = new Scanner(System.in);

	private static boolean isTerminateCommand(String input) {
		return TERMINATE_COMMAND.equals(input);
	}


	private static void insertItem() {

		System.out.println("상품 등록을 시작합니다.");
		System.out.println("상품명을 입력해주세요.");
		String name = scanner.next();
		if (name == null || name.isEmpty()) {
			System.out.println("상품명이 입력되지 않았습니다.");
			return;
		}

		System.out.println("상품 가격을 입력해주세요.");
		int price = scanner.nextInt();
		if (price < 0) {
			System.out.println("상품 가격이 잘못 입력되었습니다.");
			return;
		}

		System.out.println("상품 재고를 입력해주세요.");
		int stock = scanner.nextInt();

		Item newItem = new Item(name, price, stock);

		try {
			itemRepositoryV0.save(newItem);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public static void main(String[] args) {
		String input = scanner.next();

		System.out.println("상품 등록 시스템");
		System.out.println("종료를 뭔하시면 exit 을 입력해주세요.");

		while (!input.equals(TERMINATE_COMMAND)) {
			String next = scanner.next();
			try {
				int i = Integer.parseInt(next);
			} catch (NumberFormatException e) {
				if (next.equals(TERMINATE_COMMAND)) {
					System.out.println("종료하시겠습니까? Y / N");
					String answer = scanner.next().toLowerCase();
					if (answer.equals("y")) {
						break;
					}
				} else {
					System.out.println("숫자를 입력해주세요.");
				}
			}
//			insertItem();
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
