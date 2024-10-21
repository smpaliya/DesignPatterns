public class MovieSelection {
    String movieSelected;
    String selectMovie(String movieName){
        System.out.println(movieName+" movie selected");
        this.movieSelected=movieName;
        return movieName;
    }
}
