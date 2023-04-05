package water;

import products.IProduct;
import vehicles.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle  {

    private String hullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct, String hullType){
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
    }

    // getters and setter for hullType
    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    // Do not need to implement methods because they are declared in the Vehicle
}
