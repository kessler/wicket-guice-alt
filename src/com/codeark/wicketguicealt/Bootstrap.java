package com.codeark.wicketguicealt;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;


public final class Bootstrap extends GuiceServletContextListener {	
	@Override
	protected Injector getInjector() {		
		return Guice.createInjector(new MyModule(), new WebModule());
	}	
}
