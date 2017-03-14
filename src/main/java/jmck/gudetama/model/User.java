package jmck.gudetama.model;

import java.util.ArrayList;

public class User {

	
	int id;
	String name;
	String password;
	String email;
	byte role;
	byte wantsNotify;
	//ArrayList<Video> favourites; // liste des videos en favoris
	
	public User(int ident, String nom,String mdp, String mail,byte rol,byte notif){
		
		this.id = ident;
		this.name= nom;
		this.password = mdp;
		this.email = mail;
		this.role= rol;
		this.wantsNotify = notif;
		//this.favourites =null;
		
		
	}

	/*public ArrayList<Video> getFavourites() {
		return favourites;
	}*/

	/*public void setFavourites(ArrayList<Video> favourites) {
		this.favourites = favourites;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getRole() {
		return role;
	}

	public void setRole(byte role) {
		this.role = role;
	}

	public byte getWantsNotify() {
		return wantsNotify;
	}

	public void setWantsNotify(byte wantsNotify) {
		this.wantsNotify = wantsNotify;
	}
	
	
}
