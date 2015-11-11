package com.nepali36.model;

import java.util.List;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Match extends ArchivableModel {

	@Persistent
	private UserProfile user_first;

	@Persistent
	private UserProfile user_second;

	@Persistent
	private List<Message> messages;

	@Persistent
	private boolean unmatch;

	public UserProfile getUser_first() {
		return user_first;
	}

	public void setUser_first(UserProfile user_first) {
		this.user_first = user_first;
	}

	public UserProfile getUser_second() {
		return user_second;
	}

	public void setUser_second(UserProfile user_second) {
		this.user_second = user_second;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public boolean isUnmatch() {
		return unmatch;
	}

	public void setUnmatch(boolean unmatch) {
		this.unmatch = unmatch;
	}

}
