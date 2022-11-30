package Coffee;

public class Mochaccino extends CoffeeWithMilk {

    private int chocolateSyrup;

    public Mochaccino() {
        super("Excelsa", 50, 50, true, 50, 50);
        this.chocolateSyrup = 10;
    }

//    @Override
//    public void makeCoffee() {
//        super.makeCoffee();
//        System.out.println("On top of that he adds " + chocolateSyrup + " grams of chocolate syrup, then take "
//                + milk + " ml of milk and foams an other " + getFoam() + " ml.");
//    }

    @Override
    public int getPrice() {
        return 35;
    }

    @Override
    public int getTimeToPrepare() {
        return 5;
    }
}
