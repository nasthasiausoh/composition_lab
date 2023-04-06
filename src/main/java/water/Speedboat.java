package water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Speedboat extends Vehicle implements IWaterVehicle, IMotorised {

    private String hullType;
    private IMotorised motor;


    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = "fiberglass";      // setting the hullType to fiberglass, so we do not need to write it in the constructor as it is fixed/hard-coded in.
        this.motor = motor;
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

    public IMotorised getMotor() {
        return motor;
    }

    public void setMotor(IMotorised engine) {
        this.motor = motor;
    }

    // implement methods:

    @Override
    public void startEngine() {
        this.motor.startEngine();
    }

    @Override
    public void stopEngine() {
        this.motor.stopEngine();

    }

    @Override
    public int getHp() {
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.motor.setHp(hp);

    }

    @Override
    public int getFuel() {
        return this.motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.motor.setFuel(fuel);
    }


}