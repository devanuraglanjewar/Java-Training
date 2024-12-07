package com.jbk.day16Collection;

public class Clone  implements Cloneable{
	

	int id ;
	String name;
	
	public Clone(int id , String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Clone [id=" + id + ", name=" + name + "]";
	}
	
}
