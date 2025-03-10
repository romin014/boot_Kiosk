package level2;

public class MenuItem {
    private String name;
    private double price;
    private String explanation;

    // 생성자
    public MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    // getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return explanation;
    }

    // 메뉴 항목 문자열 표현
    @Override
    public String toString() {
        return String.format("%s | W %.2f | %s", name, price, explanation);
    }
}
