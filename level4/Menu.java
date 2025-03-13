package level4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName; // 카테고리 이름
    private List<MenuItem> menuItems; // MenuItem 리스트

    // 생성자
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
        // MenuItem enum에서 항목 추가
        addMenuItems();
    }

    // MenuItem 추가 메서드
    private void addMenuItems() {
        for (MenuItem item : MenuItem.values()) {
            menuItems.add(item);
        }
    }

    // 카테고리 이름 반환 메서드
    public String getCategoryName() {
        return categoryName;
    }

    // List에 포함된 MenuItem을 순차적으로 보여주는 메서드
    public void displayMenu() {
        System.out.println("[" + categoryName + "]");
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %s | W %.2f | %s\n", i + 1, item.getName(), item.getPrice(), item.getExplanation());
        }
    }

    // MenuItem 리스트 반환 메서드
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
