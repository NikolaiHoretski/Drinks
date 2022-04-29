public class Test {
    public static void main(String[] args) {
        Cup <Tea> cup1 = new Cup<>(new Tea());
        Cup <Coffee> cup2 = new Cup<>(new Coffee());
        Cup <Juice> cup3 = new Cup<>(new Juice());
        cup1.drink.typeOfDrink();
        cup2.drink.typeOfDrink();
        cup3.drink.typeOfDrink();


    }
}
