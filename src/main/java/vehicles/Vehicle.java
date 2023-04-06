package vehicles;

import products.IProduct;

public abstract class Vehicle implements IVehicle {  // as soon as we make this abstract we don't get any compilation errors, but we still need our methods

    private float weight;
    private int maxSpeed;
    private IProduct baseProduct;
    // just to clarify the jargon: lines 7-9 are instance variables that will become attributes below.


    public Vehicle(float weight, int maxSpeed, IProduct baseProduct){
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.baseProduct = baseProduct;
    }

    // getters and setters
    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public IProduct getBaseProduct() {
        return baseProduct;
    }

    public void setBaseProduct(IProduct baseProduct) {
        this.baseProduct = baseProduct;
    }


    // Implementing methods (just like we did in the Part class- it is actually the same code as it is for the baseProduct).

    @Override
    public float getPrice() {
        return this.baseProduct.getPrice();
    }

    @Override
    public void setPrice(float price) {
        this.baseProduct.setPrice(price);

    }

    @Override
    public long getInventory() {
        return this.baseProduct.getInventory();
    }

    @Override
    public void setInventory(long amount) {
        this.baseProduct.setInventory(amount);

    }

    @Override
    public String getTitle() {
        return this.baseProduct.getTitle();
    }

    @Override
    public void setTitle(String newTitle) {
        this.baseProduct.setTitle(newTitle);

    }

    @Override
    public void addInventory(long amount) {
        this.baseProduct.addInventory(amount);

    }

    @Override
    public void removeInventory(long amount) {
        this.baseProduct.removeInventory(amount);

    }


}
// Note:
// Use inheritance if it is an is - a relationship
// Interfaces do not necessarily have a 'has-a' relationship but helps us to establish them.
// Has-a is for composition.