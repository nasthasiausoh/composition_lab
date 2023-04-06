import products.IProduct;
import vehicles.IMotorised;

public class Motor implements IMotorised {

    private int hp;
    private int fuel;

    public Motor(int hp, int fuel) {
        this.hp = hp;
        this.fuel = fuel;
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

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;

    }

    // implement methods

    @Override
    public void startEngine() {
        System.out.println("Engine started on the water");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped on the water");
    }



}


