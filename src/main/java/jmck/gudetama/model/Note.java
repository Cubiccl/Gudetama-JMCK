package jmck.gudetama.model;

public class Note {

	
	
	byte note;
	//Subtitle subtitle;//une note est attribuée a un sous titre
	int subtitleId;
	int userId;//une note vient d'un utilisateur
	
	
	public Note(byte num, int sub, int utilisateur){
		this.note = num;
		this.subtitleId = sub;
		this.userId= utilisateur;
	}


	public byte getNote() {
		return note;
	}


	public void setNote(byte note) {
		this.note = note;
	}


	public int getSubtitleId() {
		return subtitleId;
	}


	public void setSubtitleId(int subtitle) {
		this.subtitleId = subtitle;
	}


	public int getUserId() {
		return userId;
	}


	public void setUser(int user) {
		this.userId = user;
	}
	
	
	
}
