public enum KindOfCoffee {
    Espresso("Espresso"),
    Cappuccino("Cappuccino"),
    Latte("Latte"),
    Americano("Americano"),
    Romano("Romano"),
    Breve("Breve");
    private String name;

    KindOfCoffee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " - " + name;
    }
}
