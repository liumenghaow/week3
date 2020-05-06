package com.lmh.week3.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class Home implements Serializable{
	private Date ydtime;
	private String name;
	private Integer pone;//手机
	private BigInteger type_id;
	private String bei;
	
	public String getBei() {
		return bei;
	}
	public void setBei(String bei) {
		this.bei = bei;
	}
	public Date getYdtime() {
		return ydtime;
	}
	public void setYdtime(Date ydtime) {
		this.ydtime = ydtime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPone() {
		return pone;
	}
	public void setPone(Integer pone) {
		this.pone = pone;
	}
	public BigInteger getType_id() {
		return type_id;
	}
	public void setType_id(BigInteger type_id) {
		this.type_id = type_id;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	private BigDecimal money;
	@Override
	public String toString() {
		return "Home [ydtime=" + ydtime + ", name=" + name + ", pone=" + pone + ", type_id=" + type_id + ", money="
				+ money + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((money == null) ? 0 : money.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pone == null) ? 0 : pone.hashCode());
		result = prime * result + ((type_id == null) ? 0 : type_id.hashCode());
		result = prime * result + ((ydtime == null) ? 0 : ydtime.hashCode());
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
		Home other = (Home) obj;
		if (money == null) {
			if (other.money != null)
				return false;
		} else if (!money.equals(other.money))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pone == null) {
			if (other.pone != null)
				return false;
		} else if (!pone.equals(other.pone))
			return false;
		if (type_id == null) {
			if (other.type_id != null)
				return false;
		} else if (!type_id.equals(other.type_id))
			return false;
		if (ydtime == null) {
			if (other.ydtime != null)
				return false;
		} else if (!ydtime.equals(other.ydtime))
			return false;
		return true;
	}
	

}
