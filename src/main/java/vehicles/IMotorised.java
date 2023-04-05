package vehicles;

public interface IMotorised {

    void startEngine();
    void stopEngine();
    int getHp();   //horsepower
    void setHp(int hp);
    int getFuel();                  // technically the fuel should not be part of the engine but part of the vehicle but just go with it lol.
    void setFuel(int fuel);


}
