package products;

public interface IProduct {

    float getPrice();                      //for prices it is better to use a float because it uses less memory space. It does give you less values after the decimal, but for a price you only need 2 decimals places anyway. Remember to add the 'f' for example: 12.0f.
    void setPrice(float price);
    long getInventory();
    void setInventory(long amount);
    String getTitle();
    void setTitle(String newTitle);
    void addInventory(long amount);
    void removeInventory(long amount);

    // Note that these listed above are not getters and setters, but they are method signatures. That inform our interface that these are the methods we will need to implement
}
