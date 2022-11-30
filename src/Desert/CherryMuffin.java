package Desert;

public class CherryMuffin extends Muffin {

    private String topping;

    public CherryMuffin(String topping) {
        this.topping = "cherry";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getDesertPrice() {
        return 20;
    }
}
