package day04;

public class GasStation {
    private double price;

    public GasStation(double price) {
        this.price = price;
    }

    public double refill(Car car, double liter){
        car.setFuel(liter);
        return car.getKm()*liter;
    }


    public static void main(String[] args) {
        Car car = new Car();
        GasStation gaz = new GasStation(25);
        car.setKm(10);
        car.setFuel(10);
        System.out.println(gaz.refill(car,210)+ ": forintocska ");
    }
}
