package dataparsing;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonParsing{

	//public static void main(String[] args) {
		
		
		private static final String COMMA_DELIMITER = ",";
		private static final String NEW_LINE_SEPARATOR = "\n";
		
		//CSV file header
		private static final String FILE_HEADER = "id,url,name,season,number,runtime,summary";
		
		
		public static void writeCsvFile() throws JsonIOException, JsonSyntaxException, IOException{
		ArrayList<JsonClass> list = new ArrayList<JsonClass>();
		//Gson gson = new Gson();
		//String header = "id,name,url,season,number,runtime";
	//	StringBuilder sbr = new StringBuilder();
		//sbr.append(header);
		//sbr.append("\n");
		JsonParser parser = new JsonParser();
		
			JsonElement jElement = parser.parse(new FileReader(new File("/home/manoj/Desktop/got.json")));
			JsonObject jObject = jElement.getAsJsonObject();
			JsonObject embedded = jObject.get("_embedded").getAsJsonObject();
			JsonArray episodes = embedded.get("episodes").getAsJsonArray();
			for (JsonElement episode : episodes) 
			{
				JsonObject jEpisode = episode.getAsJsonObject();
				JsonClass js=new JsonClass(jEpisode.get("id").getAsString(),jEpisode.get("url").getAsString(),jEpisode.get("name").getAsString(),jEpisode.get("season").getAsString(),jEpisode.get("number").getAsString(),jEpisode.get("runtime").getAsString(),jEpisode.get("summary").toString());
				
				//jEpisode.get("airdate").toString(),jEpisode.get("airtime").toString(),jEpisode.get("airstamp").toString(),jEpisode.get("runtime").getAsString()
				list.add(js);
			
			}
			System.out.println(list);
			
			FileWriter fileWriter = null;
			
				fileWriter = new FileWriter(new File("/home/manoj/Desktop/got_episodes.csv"));

				fileWriter.append(FILE_HEADER.toString());
				fileWriter.append(NEW_LINE_SEPARATOR);
				
				for (JsonClass s : list) {
					fileWriter.append("\"" + s.getId() + "\"");
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append("\"" +s.getUrl()+"\"");
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append("\"" +s.getName()+"\"");
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append("\"" +s.getSeason()+"\"");
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append("\"" +s.getNumber()+"\"");
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append("\"" +s.getRuntime()+"\"");
					fileWriter.append(COMMA_DELIMITER);
					fileWriter.append( s.getSummary());
					fileWriter.append(NEW_LINE_SEPARATOR);
					System.out.println("CSV file was created successfully !!!");
				}
		}
	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, IOException 
	{
			
			JsonParsing.writeCsvFile();
	}
}	
			
				/*JsonObject jEpisode = episode.getAsJsonObject();
				System.out.println(jEpisode.get("id").getAsString() + "," + jEpisode.get("name").getAsString() + ","
						+ jEpisode.get("url").getAsString() + "," + jEpisode.get("season").getAsString() + ","
						+ jEpisode.get("number").getAsString() + "," + jEpisode.get("runtime").getAsString());
				sbr.append(jEpisode.get("id").getAsString() + "," + jEpisode.get("name").getAsString() + ","
						+ jEpisode.get("url").getAsString() + "," + jEpisode.get("season").getAsString() + ","
						+ jEpisode.get("number").getAsString() + "," + jEpisode.get("runtime").getAsString());
				sbr.append("\n");
			}
			FileWriter writer = new FileWriter(new File("/home/manoj/Desktop/got_episodes.csv"));
			writer.write(sbr.toString());
			writer.close();
			System.out.println("****************" + episodes.size());
			System.out.println(embedded);
		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}	*/