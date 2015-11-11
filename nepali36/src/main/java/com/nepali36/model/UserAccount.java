package com.nepali36.model;

import java.util.List;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.nepali36.enums.Sex;
@PersistenceCapable(identityType=IdentityType.APPLICATION, detachable="true")
public class UserAccount extends ArchivableModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1403167099141329482L;

	@Persistent
	private UserProfile profile;
	
	@Persistent
	private String provider;
	
	@Persistent
	private List<Match> matches;
	
	@Persistent
	private List<UserProfile> likes;
	
	@Persistent
	private List<UserProfile> dislikes;
	
	@Persistent
	private List<Integer> ageRngIntstd;
	
	@Persistent
	private Sex genderIntstd;
	
	@Persistent
	private Integer milesRad;
	
	@Persistent
	private Integer likesPerDay;
	
	@Persistent
	private Integer messagePerDay;

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
	
	public List<UserProfile> getLikes() {
		return likes;
	}

	public void setLikes(List<UserProfile> likes) {
		this.likes = likes;
	}

	public List<UserProfile> getDislikes() {
		return dislikes;
	}

	public void setDislikes(List<UserProfile> dislikes) {
		this.dislikes = dislikes;
	}

	public List<Integer> getAgeRngIntstd() {
		return ageRngIntstd;
	}

	public void setAgeRngIntstd(List<Integer> ageRngIntstd) {
		this.ageRngIntstd = ageRngIntstd;
	}

	public Sex getGenderIntstd() {
		return genderIntstd;
	}

	public void setGenderIntstd(Sex genderIntstd) {
		this.genderIntstd = genderIntstd;
	}

	public Integer getMilesRad() {
		return milesRad;
	}

	public void setMilesRad(Integer milesRad) {
		this.milesRad = milesRad;
	}

	public Integer getLikesPerDay() {
		return likesPerDay;
	}

	public void setLikesPerDay(Integer likesPerDay) {
		this.likesPerDay = likesPerDay;
	}

	public Integer getMessagePerDay() {
		return messagePerDay;
	}

	public void setMessagePerDay(Integer messagePerDay) {
		this.messagePerDay = messagePerDay;
	}
	
	
	public UserProfile getProfile() {
		return profile;
	}

	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}
	
	
	
}
