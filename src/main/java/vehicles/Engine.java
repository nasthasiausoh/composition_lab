package vehicles;

public class Engine implements IMotorised {
    private int fuel;
    private int hp;

    public Engine(int fuel, int hp) {
    this.fuel =fuel;
    this.hp =hp;
    }

    // getters and setters

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    // implement methods:
    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }


}
