package level4;

public enum MenuItem2 {
    SHACK_BURGER("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
    SMOKE_SHACK("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
    CHEESE_BURGER("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
    HAM_BURGER("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

    private final String name;           // 메뉴 항목 이름
    private final double price;          // 가격
    private final String explanation;     // 설명

    // 생성자
    MenuItem2(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExplanation() {
        return explanation;
    }
}
