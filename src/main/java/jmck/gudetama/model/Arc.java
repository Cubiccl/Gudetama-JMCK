package jmck.gudetama.model;


import java.util.ArrayList;

public class Arc
{
	int id;
	String name;
	// maybe   ArrayList<Video> videos; // on associe plusieur videos a un arc
	
	public  Arc(int num, String chaine/*,ArrayList<Video> videolist*/ ){
		
		this.id = num;
		this.name = chaine;
		//this.videos = videolist;
	}

	/*public ArrayList<Video> getVideos() {
		return videos;
	}

	public void setVideos(ArrayList<Video> videos) {
		this.videos = videos;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
