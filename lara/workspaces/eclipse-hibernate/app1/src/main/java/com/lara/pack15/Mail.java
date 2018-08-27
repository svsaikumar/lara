package com.lara.pack15;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.*;
import javax.persistence.Table;




@Entity
@Table(name="mails")
public class Mail 
{
	@Id
	private int id;
	private String username;
	private String password;
//	@ManyToOne(cascade=CascadeType.ALL)
	private String hello;
	
	
}
