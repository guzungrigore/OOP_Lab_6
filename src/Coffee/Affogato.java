package Coffee;

public class Affogato extends Espresso {

    private int iceCream;

    public Affogato() {
        super("Robusta", 50, 30, false);
        iceCream = 100;
    }

//    @Override
//    public void makeCoffee() {
//        super.makeCoffee();
//        System.out.println("On top of that he adds " + iceCream + " grams of ice cream.");
//    }

    @Override
    public int getPrice() {
        return 40;
    }

    @Override
    public int getTimeToPrepare() {
        return 3;
    }
}
