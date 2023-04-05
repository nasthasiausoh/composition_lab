package land;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Car extends Vehicle implements ILandVehicle, IMotorised {   // It implements both ILandVehicle and IMotorised

    // we can just copy everything from the bicycle class to this car class because it is all the same.
    // Expect changing the number of wheels to 4.
    // Then we need to add in our engine from the IMotorised interface
    private int wheelCount;
    private IMotorised engine;


    public Car(float weight, int maxSpeed, IProduct baseProduct, IMotorised engine){
        super(weight, maxSpeed, baseProduct);
        this.wheelCount = 4;
        this.engine = engine;
    }

    // getter and setter for wheelCount
    @Override
    public int getWheelCount() {
        return wheelCount;
    }

    @Override
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public IMotorised getEngine() {
        return engine;
    }

    public void setEngine(IMotorised engine) {
        this.engine = engine;
    }
    //implement IMotorised methods

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
