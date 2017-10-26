package com.websystique.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String LastIP;
	
	private double CPUCharge;

	public User(){
		id=0;
	}
	
	public User(long id, String name, String LastIP, double CPUCharge){
		this.id = id;
		this.name = name;
		this.LastIP = LastIP;
		this.CPUCharge = CPUCharge;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastIP() {
		return LastIP;
	}

	public void setLastIP(String LastIP) {
		this.LastIP = LastIP;
	}

	public double getCPUCharge() {
		return CPUCharge;
	}

	public void setCPUCharge(double CPUCharge) {
		this.CPUCharge = CPUCharge;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", LastIP=" + LastIP
				+ ", CPUCharge=" + CPUCharge + "]";
	}


}
