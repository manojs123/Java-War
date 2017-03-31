package dataparsing;

public class JsonClass 
{
	private String Id;
	private String url;
	private String name;
	private String season;
	private String number;
	private String airdate;
	private String airtime;
	private String airstamp;
	private String runtime;
	private String summary;
	
	public JsonClass(String Id,String url,String name,String season,String number,String runtime,String summary)
	//String airdate,String airtime,String airstamp
	{
		this.setId(Id);
		this.url=url;
		this.name=name;
		this.season=season;
		this.number=number;
		/*this.airdate=airdate;
		this.airtime=airtime;
		this.airstamp=airstamp;*/
		this.runtime=runtime;
		this.summary=summary;
		
		
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAirdate() {
		return airdate;
	}
	public void setAirdate(String airdate) {
		this.airdate = airdate;
	}
	public String getAirtime() {
		return airtime;
	}
	public void setAirtime(String airtime) {
		this.airtime = airtime;
	}
	public String getAirstamp() {
		return airstamp;
	}
	public void setAirstamp(String airstamp) {
		this.airstamp = airstamp;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


}
