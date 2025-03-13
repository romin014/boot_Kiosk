package level4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus = new ArrayList<>(); // 여러 카테고리를 관리하는 리스트
    //생성자
    public Kiosk() {
        // 메뉴 카테고리 및 항목 추가
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.setMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.setMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.setMenuItem(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.setMenuItem(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menus.add(burgerMenu);

        // 음료수 카테고리 추가
        Menu drinksMenu = new Menu("Drinks");
        drinksMenu.setMenuItem(new MenuItem("Coke", 1.5, "코카콜라"));
        drinksMenu.setMenuItem(new MenuItem("Lemonade", 2.0, "레모네이드"));
        menus.add(drinksMenu);

        // 디저트 카테고리 추가
        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.setMenuItem(new MenuItem("FrenchFries", 3.0, "감자튀김"));
        dessertMenu.setMenuItem(new MenuItem("VanillaIceCream", 2.5, "바닐라 아이스크림"));
        menus.add(dessertMenu);
    }
    public void start() {
        Scanner input = new Scanner(System.in);

        while (true) {
            //main menu
            System.out.println("[MAIN MENU]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료    | 종료");

            System.out.print("입력 : ");
            int categoryChoice;
            try {
                categoryChoice = input.nextInt();
                if (categoryChoice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (categoryChoice > 0 && categoryChoice <= menus.size()) {
                    showMenuItems(menus.get(categoryChoice - 1), input);
                } else {
                    System.out.println("잘못된 입력입니다. 카테고리를 선택해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 카테고리를 선택해주세요.");
                input.nextLine(); // 잘못된 입력을 소비
            }
        }
    }

    private void showMenuItems(Menu menu, Scanner input) {
        System.out.println("[" + menu.getCategoryName() + " MENU]");
        List<MenuItem> items = menu.getMenuItems();
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            System.out.printf("%d. %s | W %.2f | %s\n", i + 1, item.getName(), item.getPrice(), item.getExplanation());
        }
        System.out.println("0. 뒤로가기");

        System.out.print("입력 : ");
        int itemChoice;
        try {
            itemChoice = input.nextInt();
            if (itemChoice == 0) {
                return; // 이전 메뉴로 돌아가기
            } else if (itemChoice > 0 && itemChoice <= items.size()) {
                MenuItem selectedItem = items.get(itemChoice - 1);
                System.out.printf("선택한 메뉴 : %s, W %.2f, %s\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getExplanation());
            } else {
                System.out.println("잘못된 입력입니다. 메뉴의 번호를 선택해주세요.");
            }
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 메뉴의 번호를 선택해주세요.");
            input.nextLine(); // 잘못된 입력을 소비
        }
    }
}
