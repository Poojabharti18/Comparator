package ComparatorEx;

import java.util.TreeSet;

public class MovieMain  {

	public static void main(String[] args)throws LowRatingMovieException {
		Movie m1=new Movie("theri","atlee",4,3.5f);
		Movie m2=new Movie("RRR","rajmouli",4.2f,4.0f);
		Movie m3=new Movie("KGF2","Prashant neel",4.3f,4.5f);
		Movie m4=new Movie("Bahubali","Rajmouli",4.0f,4.6f);
		RateSort r=new RateSort();
		TreeSet<Movie>set=new TreeSet<Movie>(r);
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		for(Movie m:set)
		{
			System.out.println(m);
		}
		System.out.println("=============================");
		for(Movie m:set)
		{
			if(m.getRating()>=4 && m.getDuration()>4)
			{
				System.out.println(m.getMoviename()+""+m.getDirector());
			}
			else
			{
				throw new LowRatingMovieException("movie rate low");
			}
		}

	
	
	}
}


