public class Cup <T extends Drinks> {
    public T drink;

    public Cup(T drink) {
        this.drink = drink;
    }
}
