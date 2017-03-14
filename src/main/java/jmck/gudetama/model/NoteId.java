package jmck.gudetama.model;

import java.io.Serializable;


// Classe censée faire fonctionner la clé composée de Note
public class NoteId implements Serializable {

	private int subtitleId;
	private  int userId;
	
	public NoteId(int soustitre , int utilisateur){
		this.subtitleId = soustitre;
		this.userId = utilisateur;
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

	public void setUserId(int user) {
		this.userId = user;
	}
	
	@Override
	public boolean equals(Object arg0){
		if(arg0==null)return false;
		if(!(arg0 instanceof NoteId))return false;
		NoteId arg1 = (NoteId) arg0;
		return (this.subtitleId==arg1.getSubtitleId())&&
				(this.userId == arg1.getUserId());
	}
	
	@Override
	public int hashCode(){
		int hsCode;
		hsCode = subtitleId;
		hsCode = 19 * hsCode+ userId;
		return hsCode;
	}
	
	
	
	
	
	
	
}
