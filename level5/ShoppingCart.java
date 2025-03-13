package level5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        for (CartItem cartItem : items) {
            if (cartItem.getMenuItem().getName().equals(item.getName())) {
                cartItem.increaseQuantity();
                System.out.printf("%s 의 수량이 증가했습니다.\n", item.getName());
                return;
            }
        }
        items.add(new CartItem(item, 1));
        System.out.printf("%s 이 장바구니에 추가되었습니다.\n", item.getName());
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            System.out.println("[ Orders ]");
            double total = 0;
            for (CartItem cartItem : items) {
                System.out.println(cartItem.getDetails());
                total += cartItem.getTotal();
            }
            System.out.printf("\n[ Total ]\nW %.2f\n", total);
        }
    }

    public List<CartItem> getItems() {
        return items;
    }

    public double getTotal() {
        double total = 0;
        for (CartItem cartItem : items) {
            total += cartItem.getTotal();
        }
        return total;
    }
}
