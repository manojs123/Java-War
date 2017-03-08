package movieData;

public class MovieData 
{
	private int userId;
	private int movieId;
	private double rating;
	private double junk;
	private String timeStamp;
	
	public int getUserId()
	{
		return userId;
	}
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	public int getMovieId() 
	{
		return movieId;
	}
	public void setMovieId(int i) 
	{
		this.movieId = i;
	}
	public double getRating() 
	{
		return rating;
	}
	public void setRating(double input) 
	{
		this.rating = input;
	}
	public String getTimeStamp() 
	{
		return timeStamp;
	}
	public void setTimeStamp(String string) 
	{	
		this.timeStamp=string;
		
	}
	public double getJunk() {
		return junk;
	}
	public void setJunk(double junk) {
		this.junk = junk;
	}
	
}	