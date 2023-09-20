package javaadvancedoop.inheritance;

public class Bird extends Animal{
    double wingSpan;
    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }
    public double flySpeedInMetersPerSecond(){
        return wingSpan * 4;
    }
}
