package com.nepali36.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceServletConfig extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		//TODO defining class where we would like to resolve dependencies
		return Guice.createInjector(new AppServerModule());
	}

}
