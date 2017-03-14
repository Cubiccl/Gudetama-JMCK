package jmck.gudetama.model;

public class Favourite {

	
	int id;
	int videoId;
	int userId;
	
	public Favourite(int ident , int video , int user){
		
		this.id = ident;
		this.videoId = video;
		this.userId = user;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
