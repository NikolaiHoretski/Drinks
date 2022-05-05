public class Test {
    public static void main(String[] args) {
        Cup<Tea> cup1 = new Cup<>(new Tea());
        Cup<Coffee> cup2 = new Cup<>(new Coffee());
        Cup<Juice> cup3 = new Cup<>(new Juice());
        cup1.drink.typeOfDrink();
        for (KindOfTea kindOfTea : KindOfTea.values()) {
            System.out.println(kindOfTea);
        }
        cup2.drink.typeOfDrink();
        for (KindOfCoffee kindOfCoffee : KindOfCoffee.values()) {
            System.out.println(kindOfCoffee);
        }
        cup3.drink.typeOfDrink();
        for (KindOfJuice kindOfJuice : KindOfJuice.values()) {
            System.out.println(kindOfJuice);
        }
    }
}
