package jmck.gudetama.model;



public class Language {
	
	int id;
	String name;
	
	public Language(int num, String chaine){
		
		this.id = num;
		this.name = chaine;
	}

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
