package Desert;

public class Croissant extends Desert {

    private String filling;

    public Croissant() {
        super("croissant", 20);
        this.filling = "No filling";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getDesertPrice() {
        return super.getDesertPrice();
    }
}
