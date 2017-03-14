package jmck.gudetama.model;

import java.io.Serializable;


// Classe cens�e faire fonctionner la cl� compos�e de Note
public class NoteId implements Serializable {

	private Subtitle subtitle;
	private  User user;
	
	public NoteId(Subtitle soustitre , User utilisateur){
		this.subtitle = soustitre;
		this.user = utilisateur;
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
	
	@Override
	public boolean equals(Object arg0){
		if(arg0==null)return false;
		if(!(arg0 instanceof NoteId))return false;
		NoteId arg1 = (NoteId) arg0;
		return (this.subtitle.getId()==arg1.getSubtitle().getId())&&
				(this.user.getId() == arg1.getUser().getId());
	}
	
	@Override
	public int hashCode(){
		int hsCode;
		hsCode = subtitle.hashCode();
		hsCode = 19 * hsCode+ user.hashCode();
		return hsCode;
	}
	
	
	
	
	
	
	
}
