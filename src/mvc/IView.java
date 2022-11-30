package mvc;

import Desert.*;
import People.Barista;
import People.Client;

public interface IView {
    public void printDesert(Client client, Muffin muffin, Croissant croissant, ChocolateCroissant chocolateCroissant,
                            CherryMuffin cherryMuffin, Cheesecake cheesecake, int whatDessert);

    public void coffeeOrdered(Client client, int randCoffee);

    public void timeForNextCustomer(int timeNextCustomer);

    public void simulationEnded();

    public void isSimulationEnded();

    public void statistics(Barista barista, int dailyRevenue, int totalRevenue,
                           int day, int coffeeCounter, int desertCounter);

    public void hourlyRevenue(int hourlyRevenue, int hour);

    public void border();

    public void tipQuantity(int tip);

    public void checkPrice(Client client, int check);
}
