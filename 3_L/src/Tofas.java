public class Tofas extends Car implements AirCondition{
    public void power(){
        setAcceleration(5);
    }
    public void open(){
        setAcceleration(getAcceleration() * 0.9);
    }
}
