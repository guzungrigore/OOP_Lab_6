package Coffee;

public class Frappe extends CoffeeWithMilk {

    private int ice;

    public Frappe() {
        super("Robusta", 100, 60, true, 100, 0);
        this.ice = 25;
    }

//    @Override
//    public void makeCoffee() {
//        super.makeCoffee();
//        System.out.println("On top of that he took " + ice + "grams of ice and placed it on top of the coffee, and as the final touch " +
//                "he poured " + milk + " ml of milk");
//    }

    @Override
    public int getPrice() {
        return 35;
    }
}
