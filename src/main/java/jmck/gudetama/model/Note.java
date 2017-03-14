package jmck.gudetama.model;

public class Note {

	
	
	byte note;
	Subtitle subtitle;//une note est attribuée a un sous titre
	User user;//une note vient d'un utilisateur
	
	
	public Note(byte num, Subtitle sub, User utilisateur){
		this.note = num;
		this.subtitle = sub;
		this.user= utilisateur;
	}


	public byte getNote() {
		return note;
	}


	public void setNote(byte note) {
		this.note = note;
	}


	public Subtitle getSubtitle() {
		return subtitle;
	}


	public void setSubtitle(Subtitle subtitle) {
		this.subtitle = subtitle;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
