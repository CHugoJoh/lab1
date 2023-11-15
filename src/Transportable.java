public interface Transportable {
    public boolean isCloseEnough(double x, double y);

    public void offLoad(double x, double y);

    public void onLoad();

    public void transport(double x, double y);
}
