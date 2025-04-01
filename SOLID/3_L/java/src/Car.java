public abstract class Car {
    private double acceleration;
    private double velocity;

    public Car(){
        velocity=0;
        acceleration=0;
    }

    public abstract void power();

    public void run(){
        velocity+=acceleration;
    }

    public double getVelocity(){
        return velocity;
    }
    public double getAcceleration(){
        return acceleration;
    }

    public void setVelocity(double velocity){
        this.velocity=velocity;
    }

    public void setAcceleration(double acceleration){
        this.acceleration=acceleration;
    }
}
