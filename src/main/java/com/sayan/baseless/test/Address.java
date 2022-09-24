package com.sayan.baseless.test;

import com.sayan.baseless.USEAGE.ModelBasic;

public class Address extends ModelBasic{
	
	private String country;
	private String zip;
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Address(String country, String zip) {
		//super(pk);
		this.country = country;
		this.zip = zip;
	}
	public Address() {
		//super(pk);
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", zip=" + zip + "]";
	}
	
	

}
