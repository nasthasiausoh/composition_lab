package land;

import products.IProduct;
import vehicles.Vehicle;

public class Bicycle extends Vehicle implements ILandVehicle {

    private int wheelCount;    // note we do not put int wheelCount in the constructor because we hard-coded it in as = 2.
                               // If it was a dynamic amount then we would have had to put in the constructor.
                               // Just like the bankAccount example where we had till=0 we did not have to put it in the


    public Bicycle(float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
        this.wheelCount = 2;   // setting the number of wheels to 2 because bicycles have 2 wheels
    }

    // getter and setter for wheelCount
    @Override
    public int getWheelCount() {
        return wheelCount;    // note we could have done 'return this.wheelCount' it is the same thing
    }

    @Override
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    // We do not need to implement methods because they are all declared in the Vehicle
}
