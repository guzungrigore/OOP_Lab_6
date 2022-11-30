package People;

import java.util.Random;

public class Client extends Person {
    private boolean wantsDesert;
    private boolean willTip;

    Random rand = new Random();

    public Client(String name) {
        super(name);
    }

    public void setWantsDesert(boolean wantsDesert) {
        this.wantsDesert = wantsDesert;
    }

    public void setWillTip(boolean willTip) {
        this.willTip = willTip;
    }

    public boolean isWantsDesert() {
        return wantsDesert;
    }

    public boolean isWillTip() {
        return willTip;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int timeBetweenCustomers(int hour) {
        if (hour < 10) {
            return rand.nextInt(3) + 1;
        } else if (hour < 12) {
            return rand.nextInt(7) + 1;
        } else if (hour < 15) {
            return rand.nextInt(12) + 1;
        } else if (hour < 18) {
            return rand.nextInt(16) + 1;
        } else {
            return rand.nextInt(20) + 1;
        }
    }
}
