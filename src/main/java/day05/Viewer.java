package day05;

public class Viewer {
    public void  watchmovie(Movie movie, int rating){
        movie.ratingmovie(rating);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("A szikla", 1990);
        Viewer nezo = new Viewer();
        nezo.watchmovie(movie, 5);
        nezo.watchmovie(movie, 3);
        System.out.println(movie.getAverageRate());
    }
}
