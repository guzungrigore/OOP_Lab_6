package Coffee;

public class IrishCoffee extends Espresso {

    private int whiskey;
    private int cream;

    public IrishCoffee() {
        super("Liberica", 75, 50, false);
        this.whiskey = 25;
        this.cream = 40;
    }

//    @Override
//    public void makeCoffee() {
//        super.makeCoffee();
//        System.out.println("On top of that he adds " + whiskey + " ml of whiskey and " + cream + " ml of cream");
//    }

    @Override
    public int getPrice() {
        return 65;
    }

    @Override
    public int getTimeToPrepare() {
        return 4;
    }
}
