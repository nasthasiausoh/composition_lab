import products.IProduct;
import vehicles.IMotorised;

public final class Motor implements IMotorised {

    private int hp;

    public Motor(int hp) {
        this.hp = hp;
    }
    // Getters and setters

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    // implement methods

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    @Override
    public int getFuel() {
        return 0;
    }

    @Override
    public void setFuel(int fuel) {

    }

}


