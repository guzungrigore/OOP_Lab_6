package Coffee;

public class Macchiato extends CoffeeWithMilk {

    public Macchiato() {
        super("Arabica", 100, 30, true, 0, 30);

    }

//    @Override
//    public void makeCoffee() {
//        super.makeCoffee();
//        System.out.println("On top of that he took " + getFoam() + "ml of milk and turned it into foam and poured it on top");
//    }

    @Override
    public int getPrice() {
        return 35;
    }

    @Override
    public int getTimeToPrepare() {
        return 3;
    }
}
