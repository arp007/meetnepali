package com.nepali36.model;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.google.appengine.api.datastore.GeoPt;
import com.google.appengine.api.datastore.PostalAddress;

@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class Location extends BaseModel {
		
	@Persistent
	private String city;
	
	@Persistent
	private String userProfileKey;
	
	@Persistent
	private String country;
	
	@Persistent
	private PostalAddress address;
	
	@Persistent
	private GeoPt geolocation;
	
	@Persistent
	private Integer zipcode;
	
	@Persistent
	private String state;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getZipcode() {
		return zipcode;
	}
	public PostalAddress getAddress() {
		return address;
	}
	public void setAddress(PostalAddress address) {
		this.address = address;
	}
	public GeoPt getGeolocation() {
		return geolocation;
	}
	public void setGeolocation(GeoPt geolocation) {
		this.geolocation = geolocation;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getUserProfileKey() {
		return userProfileKey;
	}

	public void setUserProfileKey(String userProfileKey) {
		this.userProfileKey = userProfileKey;
	}
	
	

}
