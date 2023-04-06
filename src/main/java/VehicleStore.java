import products.Product;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.Engine;
import vehicles.Vehicle;
import water.Kayak;
import water.Speedboat;

import java.util.ArrayList;

public class VehicleStore {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();  // Note: we could have put: 'ArrayList<IProduct> vehicles = new ...

        Bicycle bike = new Bicycle(
                10,
                20,
                new Product(350, 6, "BMX"
                ));                        // Note it doesn't have to be formatted like this. Just doing this, so it can 'look' clear/better.
        vehicles.add(bike);


        Car car = new Car(
                2000,
                120,
                new Product(50000, 2,"BMW"),
                new Engine(100, 190)
        );
        vehicles.add(car);

        Engine newEngine = new Engine(200, 500);
        car.setEngine(newEngine);

        Kayak kayak = new Kayak(
                200,
                20,
                new Product(300, 4, "Kayak Premium")
                );
        vehicles.add(kayak);


        Speedboat speedboat = new Speedboat(
                250,
                70,
                new Product(790, 13, "Speedy Gonzalez"), newEngine);
        vehicles.add(speedboat);

    }
}
