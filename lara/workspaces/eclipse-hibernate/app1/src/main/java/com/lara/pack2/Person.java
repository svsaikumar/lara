package com.lara.pack2;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person
{
	
	@EmbeddedId//(it represents composite id)
	private PersonPK personPK;
	
	
	@Column(name="last_name")
	private String lastName;
	
	private Integer age;
	public PersonPK getPersonPK() {
		return personPK;
	}
	public void setPersonPK(PersonPK personPK) {
		this.personPK = personPK;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
