package land;

import products.IProduct;
import vehicles.IVehicle;

public interface ILandVehicle extends IVehicle {

    int getWheelCount();
    void setWheelCount(int count);

}
