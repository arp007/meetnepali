package com.nepali36.guice;

import java.util.List;
import com.google.api.server.spi.guice.GuiceSystemServiceServletModule;
import com.nepali36.endpoints.Constants;
import com.nepali36.endpoints.EndpointsModule;
import com.nepali36.guice.utils.ClassFinder;

public class EndpointClassesModule extends GuiceSystemServiceServletModule {

	  @Override
	  public void configureServlets() {
	    super.configureServlets();

	    Class<?> removeModule = EndpointsModule.class;
	    Class<?> removeApi = Constants.class;

	    List<Class<?>> endpointClasses = ClassFinder.find("com.nepali36.endpoints");
	    endpointClasses.remove(removeModule);
	    endpointClasses.remove(removeApi);
	    
	    serveGuiceSystemServiceServlet("/_ah/spi/*", endpointClasses);
	  }

	}
