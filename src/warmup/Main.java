package warmup;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Margaritha();
        System.out.println(pizza.description() + ", " + pizza.getPrice() + " zł");
        pizza = new Napoli();
        System.out.println(pizza.description() + ", " + pizza.getPrice() + " zł");
    }
}
