package com.ws.model;

/**
 * persion entity
 * @author James.Wong
 *
 */

public class Person {
	
	private int id;
	private String name;
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
	
	@Override
	public String toString() {
		return "Person[id="+id+" ,name="+name+"]";
	}

}
