public class HyperCoaster extends Ride {

    private int minAge;
    private double minHeight;

    public HyperCoaster(String name, int price, int minAge, double minHeight) {
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
