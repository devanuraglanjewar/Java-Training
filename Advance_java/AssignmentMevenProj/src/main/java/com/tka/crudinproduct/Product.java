// POJO CLASS
package com.tka.crudinproduct;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
	private int pid;
	private String pname;
	private String ptype;
	private int price;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int pid, String pname, String ptype, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptype = ptype;
		this.price = price;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getPtype() {
		return ptype;
	}


	public void setPtype(String ptype) {
		this.ptype = ptype;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ptype=" + ptype + ", price=" + price + "]";
	}
	
	
	
	
}
