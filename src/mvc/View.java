package mvc;

import Desert.*;
import People.Barista;
import People.Client;

public class View implements IView{
    @Override
    public void printDesert(Client client, Muffin muffin, Croissant croissant, ChocolateCroissant chocolateCroissant, CherryMuffin cherryMuffin, Cheesecake cheesecake, int whatDessert) {
        switch (whatDessert) {
            case 1:
                System.out.println(client.getName() + " also ordered a muffin that was " + muffin.getDesertPrice() + " lei");
                break;
            case 2:
                System.out.println(client.getName() + " also ordered a croissant that was " + croissant.getDesertPrice() + " lei");
                break;
            case 3:
                System.out.println(client.getName() + " also ordered a croissant with chocolate that was " + chocolateCroissant.getDesertPrice() + " lei");
                break;
            case 4:
                System.out.println(client.getName() + " also ordered a muffin with cherry that was " + cherryMuffin.getDesertPrice() + " lei");
                break;
            case 5:
                System.out.println(client.getName() + " also ordered a cheesecake that was " + cheesecake.getDesertPrice() + " lei");
                break;
        }
    }
    @Override
    public void coffeeOrdered(Client client, int randCoffee) {
        switch (randCoffee) {
            case 1:
                System.out.println(client.getName() + " ordered an Espresso");
                break;
            case 2:
                System.out.println(client.getName() + " ordered an Americano");
                break;
            case 3:
                System.out.println(client.getName() + " ordered an Affogato");
                break;
            case 4:
                System.out.println(client.getName() + " ordered a Cappucino");
                break;
            case 5:
                System.out.println(client.getName() + " ordered a Flat White");
                break;
            case 6:
                System.out.println(client.getName() + " ordered an Irish Coffee");
                break;
            case 7:
                System.out.println(client.getName() + " ordered a Macchiato");
                break;
            case 8:
                System.out.println(client.getName() + " ordered a Mochaccino");
                break;
            case 9:
                System.out.println(client.getName() + " ordered a Vietnamese Coffee");
                break;
        }
    }
    @Override
    public void timeForNextCustomer(int timeNextCustomer) {
        System.out.println("A new customer arrived in " + timeNextCustomer + " minutes.");
    }
    @Override
    public void simulationEnded() {
        System.out.println("Simulation ended.");
    }
    @Override
    public void isSimulationEnded() {
        System.out.println("Type 0 to end the simulation or 1 to continue it");
    }
    @Override
    public void statistics(Barista barista, int dailyRevenue, int totalRevenue, int day, int coffeeCounter, int desertCounter) {
        border();
        System.out.println("Total revenue for day " + day + ": " + dailyRevenue + " lei");
        System.out.println("Total coffee ordered today: " + coffeeCounter);
        System.out.println("Total deserts ordered today: " + desertCounter);
        System.out.println("Barista's current proficiency: " + barista.getProficiency());
        System.out.println("Total revenue made so far " + totalRevenue);
    }
    @Override
    public void hourlyRevenue(int hourlyRevenue, int hour) {
        System.out.println("Total revenue at hour " + hour + " was: " + hourlyRevenue + " lei");
    }
    @Override
    public void border() {
        System.out.println("***************************************************");
    }
    @Override
    public void tipQuantity(int tip) {
        System.out.println("The client also tipped the barista " + tip + " lei");
    }
    @Override
    public void checkPrice(Client client, int check) {
        System.out.println(client.getName() + " payed " + check + " lei");
    }
}
