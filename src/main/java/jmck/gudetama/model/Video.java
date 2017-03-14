package jmck.gudetama.model;

public class Video {

	int id;
	int episode;
	String name_japanese;
	String name_english;
	String url;
	Arc arc;//un episode apartient a un arc
	
	
	
	public Video(int ident, int epis, String jap,String eng,String lien,Arc season){
		this.id = ident;
		this.episode = epis;
		this.name_japanese = jap;
		this.name_english = eng;
		this.url = lien;
		this.arc = season;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getEpisode() {
		return episode;
	}



	public void setEpisode(int episode) {
		this.episode = episode;
	}



	public String getName_japanese() {
		return name_japanese;
	}



	public void setName_japanese(String name_japanese) {
		this.name_japanese = name_japanese;
	}



	public String getName_english() {
		return name_english;
	}



	public void setName_english(String name_english) {
		this.name_english = name_english;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public Arc getArc() {
		return arc;
	}



	public void setArc(Arc arc) {
		this.arc = arc;
	}
	
	
}
