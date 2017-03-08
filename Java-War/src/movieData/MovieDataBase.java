package movieData;

import java.util.List;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class MovieDataBase 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		
		ArrayList<MovieData> data = new ArrayList<MovieData>();
		Set<Integer> list = new HashSet<Integer>();
		Set<Integer> list1 = new HashSet<Integer>();
		//HashMap<Integer,Integer>map1=new HashMap<Integer,Integer>();
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
		//LinkedHashMap<Integer,Integer>map2=new LinkedHashMap<Integer,Integer>();
		Multimap<Integer, Integer> multimap = ArrayListMultimap.create();
				
		BufferedReader inFile = new BufferedReader(new FileReader("/home/manoj/Desktop/Vote.txt"));

		String inputLine;
		
		
		while ( (inputLine = inFile.readLine() ) != null) // read one line at a time
		{ 
			MovieData movieData = new MovieData();
			//data.add(new MovieData(input[0], input[1], input[2], input[3]);
		    
			String[] input = inputLine.split("\t"); // split into a string array by tab space.
			movieData.setUserId(Integer.parseInt(input[0]));
		    movieData.setMovieId(Integer.parseInt(input[1]));
		    movieData.setRating(Double.parseDouble(input[2]));
		    movieData.setJunk(Double.parseDouble(input[3]));
		    movieData.setTimeStamp(input[4]);
//		    String timestamp=input[3];
		    
		        data.add(movieData);
		}
		inFile.close();
		for(MovieData a : data)
		{
			list.add(a.getUserId());
			list1.add(a.getMovieId());
//			map1.put(a.getUserId(), a.getMovieId());
			map.put(a.getMovieId(), a.getRating());
			multimap.put(a.getUserId(),a.getMovieId());
			//System.out.println(a.getUserId()+", " +a.getMovieId()+ ", " +a.getRating()+ ", " +a.getJunk()+ ", " +a.getTimeStamp());
		}
		//int max=0;
		for (java.util.Map.Entry<Integer, Collection<Integer>> entry : multimap.asMap().entrySet()) 
		{
		    System.out.println(entry.getKey() + " = " + entry.getValue().size());
		}

		
		
		System.out.println("Number of Unique Users:" +list.size()); // Count of Number of Unique Users 
		System.out.println("Number of Unique Movies:" +list1.size()); // Count of Number  of Unique MovieId
		
//		for (Map.Entry<Integer, Double> entry : map.entrySet()) 
//		{
//		    System.out.println(entry.getKey()+" : "+entry.getValue());
//		}

		
		//MOVIE WITH HIGHEST RATING 
		Double bestSeenValue = null;
		List<Integer> bestKeys = new ArrayList<>();
		for (java.util.Map.Entry<Integer, Double> entry : map.entrySet())
		{
		  if (bestSeenValue == null || entry.getValue() > bestSeenValue) 
		  {
		    bestSeenValue = entry.getValue();
		    bestKeys.clear();
		  }
		  if (entry.getValue().equals(bestSeenValue)) {
		    bestKeys.add(entry.getKey());
		  }
		}
		System.out.println("Movie with Highest Rating:"+bestKeys); // ALL MOVIE IDS WITH HIGHEST RATING
		
		//MOVIES WITH LOWEST RATING
		
		Double bestSeenValue1 = null;
		List<Integer> bestKeys1 = new ArrayList<>();
		for (java.util.Map.Entry<Integer, Double> entry : map.entrySet())
		{
		  if (bestSeenValue1 == null || entry.getValue() < bestSeenValue1) 
		  {
		    bestSeenValue1 = entry.getValue();
		    bestKeys1.clear();
		  }
		  if (entry.getValue().equals(bestSeenValue1)) {
		    bestKeys1.add(entry.getKey());
		  }
		}
		System.out.println("Movies with Lowest Rating:"+bestKeys1);  //ALL MOVIES WITH LOWEST RATINGS
		

	}
}	