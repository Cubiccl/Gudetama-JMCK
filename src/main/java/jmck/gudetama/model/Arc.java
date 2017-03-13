package jmck.gudetama.model;

import javax.persistence.*;

@Entity
@Table(name="Arc")
public class Arc
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;

	public Integer getId()
	{
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
