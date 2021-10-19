package day02;

public class Rectangle {
    private double aside;
    private double  bside;

    public Rectangle(int aside, int bside) {
        this.aside = aside;
        this.bside = bside;
    }
    public double calculateArea (){
        return aside*bside;
    }
}
