package com.nepali36.model;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.google.api.server.spi.config.DefaultValue;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.SUBCLASS_TABLE)
public abstract class ArchivableModel extends BaseModel {
	
	@Persistent()
	private boolean is_archived;

	public boolean is_archived() {
		return is_archived;
	}

	public void set_archived(boolean is_archived) {
		this.is_archived = is_archived;
	}
	
	

}
