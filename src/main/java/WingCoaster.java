public class WingCoaster extends Ride {
    Ride ride;

    private int minAge;
    private double minHeight;

    public WingCoaster(String name, int price, int minAge, double minHeight) {
        super(name, price);
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public int getMinAge() {
        return this.minAge;
    }

    public double getMinHeight() {
        return this.minHeight;
    }
}
