package com.nepali36.persistence.impl;

import javax.inject.Inject;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

public abstract class AppPersistenceDaoImpl<T, I> extends BaseDaoImpl<T, I> {
	
	abstract protected Class<T> getClassT();
	
	protected PersistenceManagerFactory pmf;
	
	@Inject
	public void setPersistenceManagerFactory(PersistenceManagerFactory pmf){
		this.pmf = pmf;
	}
	
	
	public PersistenceManager getPersistenceManager() {
		return pmf.getPersistenceManager();
	}

}
