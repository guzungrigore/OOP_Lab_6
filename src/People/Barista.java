package People;

public class Barista extends Person {
    private int salary;
    private int coffeeMade;

    private String proficiency;

    public Barista(String proficiency) {
        super("People.Barista");
        this.salary = 500;
        this.proficiency = proficiency;
        if (proficiency == "Expert"){
            this.coffeeMade = 500;
        } else if (proficiency == "Intermediate") {
            this.coffeeMade = 200;
        } else {
            this.coffeeMade = 0;
        }
    }

    public int getSalary() {
        return salary;
    }

    private int getCoffeeMade() {
        return coffeeMade;
    }

    public void setProficiency() {
        if (getCoffeeMade() <= 200) {
            this.proficiency = "Beginner";
        } else if (getCoffeeMade() >= 500) {
            this.proficiency = "Expert";
        } else {
            this.proficiency = "Intermediate";
        }
    }

    public void setCoffeeMade(String coffee) {
        if (coffee == "Americano" || coffee == "Espresso") {
            this.coffeeMade++;
        } else if( coffee == "Cappucino" || coffee == "Frappe" || coffee == "FlatWhite") {
            this.coffeeMade += 2;
        } else if (coffee == "Affogato" || coffee == "Macchiato" || coffee == "Mochaccino") {
            this.coffeeMade += 3;
        } else if (coffee == "IrishCoffee") {
            this.coffeeMade += 4;
        } else
            this.coffeeMade += 5;

        setProficiency();
    }

    public int skill() {
        if (this.proficiency == "Expert"){
            return -1;
        } else if (this.proficiency == "Beginner") {
            return 2;
        } return 0;
    }

    public String getProficiency() {
        return proficiency;
    }
}
