package level2_2;

import level2.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        //menuItems.add(new MenuItem("종료", 0, "종료"));

        while(true){
            System.out.println("[SHAKESHACK MENU]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %s | W %.2f | %s\n", i+1, item.getName(), item.getPrice(), item.getexplanation());
            }
            System.out.println("0. 종료    | 종료");

            System.out.print("입력 : ");
            int a = input.nextInt();
            if(a==0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else{
                try{
                    MenuItem item = menuItems.get(a-1);
                    System.out.printf("선택한 메뉴 : %s, W %.2f, %s\n", item.getName(), item.getPrice(), item.getexplanation());

                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다. 메뉴의 번호를 선택해주세요.");
                    input.nextLine(); // 잘못된 입력을 소비
                }
            }


        }

    }
}
