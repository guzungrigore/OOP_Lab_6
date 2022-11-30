package Coffee;

public class CoffeeWithMilk extends Espresso {

    protected int milk;
    private int foam;

    public CoffeeWithMilk(String typeOfCoffee, int quantityOfWater, int quantityOfCoffee, boolean sugar, int milk, int foam) {
        super(typeOfCoffee, quantityOfWater, quantityOfCoffee, sugar);
        this.milk = milk;
        this.foam = foam;
    }

    public int getFoam() {
        return foam;
    }

}
