package com.nepali36.model;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;

@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class Message extends ArchivableModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3675109211012208710L;

	@Persistent
	private Text txtmsg;
	
	@Persistent
	private boolean read;
	
	@Persistent
	private boolean delivered;
	
	public Text getTxtmsg() {
		return txtmsg;
	}
	public void setTxtmsg(Text txtmsg) {
		this.txtmsg = txtmsg;
	}
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	

	
	

}
