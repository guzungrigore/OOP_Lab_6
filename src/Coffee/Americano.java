package Coffee;

public class Americano extends Espresso {
    private int hotWater;

    public Americano() {
        super("Arabica", 50, 25, true);
        hotWater = 150;
    }

    public Americano(String typeOfCoffee, int quantityOfWater, int quantityOfCoffee, boolean sugar, int hotWater) {
        super();
        this.hotWater = hotWater;
    }

//    @Override
//    public void makeCoffee() {
//        super.makeCoffee();
//        System.out.println("And also " + hotWater + " ml of hot water.");
//    }

    @Override
    public int getPrice() {
        return 20;
    }
}
