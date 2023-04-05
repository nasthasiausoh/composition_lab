package water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Speedboat extends Vehicle implements IWaterVehicle, IMotorised {

    private String hullType;
    private IMotorised engine;


    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised engine) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.engine = engine;
    }

    // getters and setters off hullType and engine:
    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    public IMotorised getEngine() {
        return engine;
    }

    public void setEngine(IMotorised engine) {
        this.engine = engine;
    }

    // implement methods:

    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();

    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);

    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }


}