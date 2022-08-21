package ComparatorEx;

public class Movie {

    private String moviename;
    private String director;
    private float duration;
    private float rating;
    public Movie()
    {
        
    }
    
    

    public Movie(String moviename, String director, float duration, float rating) {
        super();
        this.moviename = moviename;
        this.director = director;
        this.duration = duration;
        this.rating = rating;
    }

    public String getMoviename() {
        return moviename;
    }
    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public float getDuration() {
        return duration;
    }
    public void setDuration(float duration) {
        this.duration = duration;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    
    @Override
    public String toString() {
        return "Movie [moviename=" + moviename + ", director=" + director + ", duration=" + duration + ", rating="
                + rating + "]";
    }
}


