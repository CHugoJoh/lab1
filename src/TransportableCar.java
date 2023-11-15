public abstract class TransportableCar extends Car implements Transportable{
    public boolean isCloseEnough(double x, double y){
        double dX = x - getX();
        double dY = y - getY();
        double hypotenuse = Math.hypot(dX,dY);

        return hypotenuse < 5;
    }

    public void offLoad(double x, double y){
        this.x = x;
        this.y = y;
    }

}
