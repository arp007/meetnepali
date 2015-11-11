package com.nepali36.endpoints;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.nepali36.persistence.impl.UserDaoImpl;
import com.nepali36.persistence.impl.UserProfileDaoImpl;

/*
 * Using this class to bind all the dependencies for the endpoints classes
 * 
 */
public class EndpointsModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(UserDaoImpl.class).in(Singleton.class);
		bind(UserProfileDaoImpl.class).in(Singleton.class);
		
	}

}
