package jmck.gudetama.model;



public class Subtitle {
	
	int id;
	String url;
	Language language;
	User user;
	Video video;
	// maybe add a arraylist<note> 
	
	
	public Subtitle(int ident, String lien, Language langue, User utilisateur,Video vid){
		this.id = ident;
		this.url=lien;
		this.language=langue;
		this.user=utilisateur;
		this.video=vid;
		
		
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


	public Language getLanguage() {
		return language;
	}


	public void setLanguage(Language language) {
		this.language = language;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Video getVideo() {
		return video;
	}


	public void setVideo(Video video) {
		this.video = video;
	}
	
	
}
