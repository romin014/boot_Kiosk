package level4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus; // 여러 카테고리를 관리하는 리스트
    //생성자
    public Kiosk() {
        menus = new ArrayList<>();
        Menu burgerMenu = new Menu("버거 메뉴");
        menus.add(burgerMenu);

    }

    public void start() {
        Scanner input = new Scanner(System.in);

        // 메뉴 카테고리 출력
        System.out.println("[메뉴 카테고리]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, menus.get(i).getCategoryName());
        }
        System.out.println("0. 종료");

        System.out.print("카테고리 선택 : ");
        int categoryChoice = input.nextInt();

        // 입력된 카테고리 선택 처리
        if (categoryChoice > 0 && categoryChoice <= menus.size()) {
            Menu selectedMenu = menus.get(categoryChoice - 1);
            selectedMenu.displayMenu(); // 선택한 카테고리의 메뉴 출력

            System.out.print("메뉴 선택 : ");
            int menuChoice = input.nextInt();

            // 입력된 메뉴 선택 처리
            if (menuChoice > 0 && menuChoice <= selectedMenu.getMenuItems().size()) {
                MenuItem selectedItem = selectedMenu.getMenuItems().get(menuChoice - 1);
                System.out.printf("%s를 선택하셨습니다.\n", selectedItem.getName());
                System.out.printf("가격: W %.2f\n설명: %s\n", selectedItem.getPrice(), selectedItem.getExplanation());
            } else {
                System.out.println("잘못된 메뉴 선택입니다.");
            }
        } else if (categoryChoice == 0) {
            System.out.println("프로그램을 종료합니다.");
        } else {
            System.out.println("잘못된 카테고리 선택입니다.");
        }

    }
}
