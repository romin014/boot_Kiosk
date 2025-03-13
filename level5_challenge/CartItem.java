package level5_challenge;

public class CartItem {
    private MenuItem menuItem;
    private int quantity;

    public CartItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    public double getTotal() {
        return menuItem.getPrice() * quantity;
    }

    public String getDetails() {
        return String.format("%s | W %.2f | 수량: %d", menuItem.getName(), menuItem.getPrice(), quantity);
    }


}
