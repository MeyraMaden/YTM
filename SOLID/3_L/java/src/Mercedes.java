public class Mercedes extends Car implements BoostCar{
    public void power(){
        setAcceleration(7);
    }
    public void boost(){
        setAcceleration(getAcceleration() *2);
    }
}
