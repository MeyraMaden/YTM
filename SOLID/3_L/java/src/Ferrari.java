public class Ferrari extends Car implements BoostCar,AirCondition{
    public void power(){
        setAcceleration(10);
    }
    public void boost(){
        setAcceleration(getAcceleration() *2);
    }
    public void open(){
        setAcceleration(getAcceleration() *0.9);
    }
}
