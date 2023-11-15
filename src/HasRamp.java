public interface HasRamp {
    public void raiseRamp();
    public void lowerRamp();
    public double getRampDegree();         
    default public boolean isRampDown() {
        return !(getRampDegree() > 0.0);
    }                                                         
}
