package Coffee;

public class Cappucino extends CoffeeWithMilk {

    public Cappucino() {
        super("Arabica", 50, 20, false, 50, 20);
    }

//    @Override
//    public void makeCoffee() {
//        super.makeCoffee();
//        System.out.println("On top of that he adds " + milk + " ml of milk an foams " + getFoam() + " ml");
//    }

    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public int getTimeToPrepare() {
        return 4;
    }
}
