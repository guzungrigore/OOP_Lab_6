import mvc.Controller;
import mvc.IController;

public class Main {

    public static void main(String[] args) {
        IController controller = new Controller();
        controller.display();
    }
}