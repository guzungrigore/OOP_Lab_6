package Desert;
public class ChocolateCroissant extends Croissant{

    private String filling;

    public ChocolateCroissant(String filling) {
        this.filling = "chocolate";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getDesertPrice() {
        return 25;
    }
}
