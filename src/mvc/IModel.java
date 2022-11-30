package mvc;

import Coffee.*;
import Desert.*;
import People.Barista;
import People.Client;

import java.util.Random;
import java.util.Scanner;

public interface IModel {
    public Barista getBarista();
    public Espresso getEspresso();

    public int calculateSweet(Muffin muffin, Croissant croissant, ChocolateCroissant chocolateCroissant,
                              CherryMuffin cherryMuffin, Cheesecake cheesecake, int check, int whatDessert);

    public void willTipAndWantDesert(Client client, Random rand);

    public Scanner getScanner();

    public Random getRandom();

    public Client getClient();

    public void randomName(Client client, Random rand);

    public int getPrice(Espresso espresso, Americano americano, Affogato affogato, Cappucino cappucino,
                        FlatWhite flatWhite, IrishCoffee irishCoffee, Macchiato macchiato,
                        Mochaccino mochaccino, VietnameseCoffee vietnameseCoffee, int check, int randCoffee);

    public int getTimePassed(Barista barista, Espresso espresso, Americano americano, Affogato affogato,
                             Cappucino cappucino, FlatWhite flatWhite, IrishCoffee irishCoffee, Macchiato macchiato,
                             Mochaccino mochaccino, VietnameseCoffee vietnameseCoffee, int timePassed, int randCoffee);

    public Cheesecake getCheesecake();

    public CherryMuffin getCherryMuffin();

    public Croissant getCroissant();

    public ChocolateCroissant getChocolateCroissant();

    public Muffin getMuffin();

    public VietnameseCoffee getVietnameseCoffee();

    public Mochaccino getMochaccino();

    public Macchiato getMacchiato();

    public IrishCoffee getIrishCoffee();

    public FlatWhite getFlatWhite();

    public Cappucino getCappucino();

    public Affogato getAffogato();

    public Americano getAmericano();
}
