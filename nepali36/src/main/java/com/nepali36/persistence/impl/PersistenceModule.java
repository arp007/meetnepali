package com.nepali36.persistence.impl;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class PersistenceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(UserDaoImpl.class).in(Singleton.class);
		
	}

}
