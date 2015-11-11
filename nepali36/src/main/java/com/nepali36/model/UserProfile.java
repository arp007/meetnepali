package com.nepali36.model;

import java.util.List;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.google.appengine.api.datastore.Link;
import com.google.appengine.api.datastore.Text;
import com.nepali36.enums.Sex;

@PersistenceCapable(identityType=IdentityType.APPLICATION, detachable="true")
public class UserProfile extends ArchivableModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3294029998648006890L;

	@Persistent
	private String firstName;
	
	@Persistent()
	private String accountKey;

	@Persistent
	private String email;
	
	@Persistent
	private String lastName;
	
	@Persistent
	private String fullname;
	
	@Persistent
	private Long fbId;
	
	@Persistent
	private Integer age;
	
	@Persistent
	private Location location;
	
	@Persistent
	private Sex sex;
	
	@Persistent
	private List<Link> pictures;
	
	@Persistent
	private Text description;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public List<Link> getPictures() {
		return pictures;
	}

	public void setPictures(List<Link> pictures) {
		this.pictures = pictures;
	}

	public Text getDescription() {
		return description;
	}

	public void setDescription(Text description) {
		this.description = description;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Long getFbId() {
		return fbId;
	}

	public void setFbId(Long fbId) {
		this.fbId = fbId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountKey() {
		return accountKey;
	}

	public void setAccountKey(String accountKey) {
		this.accountKey = accountKey;
	}

	
	

}
