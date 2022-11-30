package Desert;

public class Desert {

    private String name;
    private int desertPrice;

    protected Desert(String name, int desertPrice) {
        this.name = name;
        this.desertPrice = desertPrice;
    }

    public String getName() {
        return name;
    }

    public int getDesertPrice() {
        return desertPrice;
    }
}
