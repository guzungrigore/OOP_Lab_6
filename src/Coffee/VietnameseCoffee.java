package Coffee;

public class VietnameseCoffee extends Americano {

    private int condensedMilk;

    public VietnameseCoffee() {
        super("Liberica", 100, 75, false, 150);
        this.condensedMilk = 25;
    }

//    @Override
//    public void makeCoffee() {
//        super.makeCoffee();
//        System.out.println("On top of that he added " + condensedMilk + " grams of condensed milk");
//    }

    @Override
    public int getPrice() {
        return 45;
    }

    @Override
    public int getTimeToPrepare() {
        return 6;
    }
}
