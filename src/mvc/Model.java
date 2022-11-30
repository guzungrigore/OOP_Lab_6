package mvc;

import Coffee.*;
import Desert.*;
import People.Barista;
import People.Client;

import java.util.Random;
import java.util.Scanner;

public class Model implements IModel{
    @Override
    public Barista getBarista() {
        return new Barista("Beginner");
    }
    @Override
    public Espresso getEspresso() {
        return new Espresso();
    }
    @Override
    public int calculateSweet(Muffin muffin, Croissant croissant, ChocolateCroissant chocolateCroissant, CherryMuffin cherryMuffin, Cheesecake cheesecake, int check, int whatDessert) {
        switch (whatDessert) {
            case 1:
                check += muffin.getDesertPrice();
                break;
            case 2:
                check += croissant.getDesertPrice();
                break;
            case 3:
                check += chocolateCroissant.getDesertPrice();
                break;
            case 4:
                check += cherryMuffin.getDesertPrice();
                break;
            case 5:
                check += cheesecake.getDesertPrice();
                break;
        }
        return check;
    }

    @Override
    public void willTipAndWantDesert(Client client, Random rand) {
        int randomWillTip = rand.nextInt(2) + 1;
        client.setWillTip(randomWillTip != 1);

        int randomWantsDesert = rand.nextInt(2) + 1;
        client.setWantsDesert(randomWantsDesert != 1);
    }
    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    @Override
    public Random getRandom() {
        return new Random();
    }
    @Override
    public Client getClient() {
        return new Client("client");
    }
    @Override
    public void randomName(Client client, Random rand) {
        int randName = rand.nextInt(5) + 1;
        if (randName == 1) {
            client.setName("Greg");
        } else if (randName == 2) {
            client.setName("Alex");
        } else if (randName == 3) {
            client.setName("Anna");
        } else if (randName == 4) {
            client.setName("Bob");
        } else {
            client.setName("Alice");
        }
    }
    @Override
    public int getPrice(Espresso espresso, Americano americano, Affogato affogato, Cappucino cappucino, FlatWhite flatWhite, IrishCoffee irishCoffee, Macchiato macchiato, Mochaccino mochaccino, VietnameseCoffee vietnameseCoffee, int check, int randCoffee) {
        switch (randCoffee) {
            case 1:
                check += espresso.getPrice();
                break;
            case 2:
                check += americano.getPrice();
                break;
            case 3:
                check += affogato.getPrice();
                break;
            case 4:
                check += cappucino.getPrice();
                break;
            case 5:
                check += flatWhite.getPrice();
                break;
            case 6:
                check += irishCoffee.getPrice();
                break;
            case 7:
                check += macchiato.getPrice();
                break;
            case 8:
                check += mochaccino.getPrice();
                break;
            case 9:
                check += vietnameseCoffee.getPrice();
                break;
        }
        return check;
    }
    @Override
    public int getTimePassed(Barista barista, Espresso espresso, Americano americano, Affogato affogato, Cappucino cappucino, FlatWhite flatWhite, IrishCoffee irishCoffee, Macchiato macchiato, Mochaccino mochaccino, VietnameseCoffee vietnameseCoffee, int timePassed, int randCoffee) {
        switch (randCoffee) {
            case 1:
                timePassed += espresso.getTimeToPrepare() + barista.skill();
                barista.setCoffeeMade("Espresso");
                break;
            case 2:
                timePassed += americano.getPrice() + barista.skill();
                barista.setCoffeeMade("Americano");
                break;
            case 3:
                timePassed += affogato.getTimeToPrepare() + barista.skill();
                barista.setCoffeeMade("Affogato");
                break;
            case 4:
                timePassed += cappucino.getTimeToPrepare() + barista.skill();
                barista.setCoffeeMade("Cappucino");
                break;
            case 5:
                timePassed += flatWhite.getTimeToPrepare() + barista.skill();
                barista.setCoffeeMade("FlatWhite");
                break;
            case 6:
                timePassed += irishCoffee.getTimeToPrepare() + barista.skill();
                barista.setCoffeeMade("IrishCoffee");
                break;
            case 7:
                timePassed += macchiato.getTimeToPrepare() + barista.skill();
                barista.setCoffeeMade("Macchiato");
                break;
            case 8:
                timePassed += mochaccino.getTimeToPrepare() + barista.skill();
                barista.setCoffeeMade("Mochaccino");
                break;
            case 9:
                timePassed += vietnameseCoffee.getTimeToPrepare() + barista.skill();
                barista.setCoffeeMade("VietnameseCoffee");
                break;
        }
        return timePassed;
    }

    @Override
    public Cheesecake getCheesecake() {
        return new Cheesecake();
    }
    @Override
    public CherryMuffin getCherryMuffin() {
        return new CherryMuffin("cherry");
    }
    @Override
    public Croissant getCroissant() {
        return new Croissant();
    }
    @Override
    public ChocolateCroissant getChocolateCroissant() {
        return new ChocolateCroissant("chocolate");
    }
    @Override
    public Muffin getMuffin() {
        return new Muffin();
    }
    @Override
    public VietnameseCoffee getVietnameseCoffee() {
        return new VietnameseCoffee();
    }
    @Override
    public Mochaccino getMochaccino() {
        return new Mochaccino();
    }
    @Override
    public Macchiato getMacchiato() {
        return new Macchiato();
    }
    @Override
    public IrishCoffee getIrishCoffee() {
        return new IrishCoffee();
    }
    @Override
    public FlatWhite getFlatWhite() {
        return new FlatWhite();
    }
    @Override
    public Cappucino getCappucino() {
        return new Cappucino();
    }
    @Override
    public Affogato getAffogato() {
        return new Affogato();
    }
    @Override
    public Americano getAmericano() {
        return new Americano();
    }

}
