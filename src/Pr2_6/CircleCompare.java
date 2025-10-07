package Pr2_6;
public class CircleCompare {
    private double x;
    private double y;
    private double r;
    private String colour;

    public CircleCompare(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    public double getR() {
        return r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getLength() {
        return 2 * Math.PI * r;
    }

    public boolean compareByRadius(CircleCompare other) {
        if (other == null) return false;
        return this.r == other.getR();
    }

    @Override
    public String toString() {
        return "CircleCompare[r=" + r + ", colour=" + colour + "]";
    }
}