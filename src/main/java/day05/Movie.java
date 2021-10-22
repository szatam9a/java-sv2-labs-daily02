package day05;

public class Movie {
    private String title;
    private int ageOfRelease;
    private double averageRate;
    private int rateCounter;
    private int rateSum;

    public Movie(String title, int ageOfRelease) {
        this.title = title;
        this.ageOfRelease = ageOfRelease;
    }
    public double ratingmovie(int rate){
        rateCounter++;
        rateSum= rateSum+ rate;
        averageRate= rateSum/rateCounter;
        return averageRate;
    }

    public String getTitle() {
        return title;
    }

    public int getAgeOfRelease() {
        return ageOfRelease;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public int getRateCounter() {
        return rateCounter;
    }

    public int getRateSum() {
        return rateSum;
    }
}
