package com.nepali36.guice;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.nepali36.endpoints.EndpointsModule;
import com.nepali36.persistence.impl.PersistenceModule;

public class AppServerModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new EndpointClassesModule());
		install(new EndpointsModule());
		install(new PersistenceModule());
	}
	
	@Provides
	@com.google.inject.Singleton
	PersistenceManagerFactory providePersistenceManager(){
		return JDOHelper.getPersistenceManagerFactory("transactions-optional");
	}
	
	@Provides
	@com.google.inject.Singleton
	UserService providerUserService(){
		return UserServiceFactory.getUserService();
	}
	
	@Provides
	User provideGoogleSysUser(){
		return providerUserService().getCurrentUser();
	}

}
