package ComparatorEx;

import java.util.Comparator;

public class RateSort implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		
		return Float.compare(o1.getRating(), o2.getRating());
	}
	

}
