package day04;

public class Car {
    private double km;
    private double fuel;


    public void setKm(double km) {
        this.km = km;
    }
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public double getKm() {
        return km;
    }
    public double getFuel() {
        return fuel;
    }

    public double averageFuelComsuptionOn100Km(){
        return fuel/km*100.000;
    }
}
