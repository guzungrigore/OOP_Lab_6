package Coffee;

public class FlatWhite extends CoffeeWithMilk {

    public FlatWhite() {
        super("Excelsa", 75, 50, true, 75, 0);
    }

//    @Override
//    public void makeCoffee() {
//        super.makeCoffee();
//        System.out.println("On top of that he took " + milk + "ml of milk poured it on top");
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
