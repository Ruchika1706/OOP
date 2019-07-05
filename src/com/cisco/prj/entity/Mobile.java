package com.cisco.prj.entity;

public class Mobile extends Product {
	private String connectivity;

	public String getConnectivity() {
		return connectivity;
	}

	@Override
	public boolean isExpensive() {
		if("3G".contentEquals(connectivity) && getPrice() >3500) {
			return true;
		} else if("4G".contentEquals(connectivity) && getPrice() > 15000) {
			return true;
		}
		return true;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	public Mobile() {
		super();
	}

	public Mobile(int id, String name, double price, String connectivity) {
		super(id, name, price);
		this.connectivity = connectivity;
	}
	

}
