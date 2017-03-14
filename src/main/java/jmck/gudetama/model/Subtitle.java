package jmck.gudetama.model;



public class Subtitle {
	
	int id;
	String url;
	//Language language;
	int languageId;
	//User user;
	int userId;
	//Video video;
	int videoId;
	
	
	
	public Subtitle(int ident, String lien, int langue, int utilisateur,int vid){
		this.id = ident;
		this.url=lien;
		this.languageId=langue;
		this.userId=utilisateur;
		this.videoId=vid;
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public int getLanguageId() {
		return languageId;
	}


	public void setLanguageId(int language) {
		this.languageId = language;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int user) {
		this.userId = user;
	}


	public int getVideoId() {
		return videoId;
	}


	public void setVideoId(int video) {
		this.videoId = video;
	}
	
	
}
