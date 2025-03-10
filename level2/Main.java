package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menuItems.add(new MenuItem("종료", 0, "종료"));

        // Scanner 선언
        Scanner input = new Scanner(System.in);

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        System.out.println("[SHAKESHACK MENU]");
        for (int i = 0; i < menuItems.toArray().length; i++) {
            System.out.printf(String.valueOf(menuItems.get(i)));
        }

        System.out.print("입력 : ");


        // 숫자를 입력 받기
        // 입력된 숫자에 따른 처리
        // 프로그램을 종료
        // 선택한 메뉴 : 이름, 가격, 설명

    }

}
