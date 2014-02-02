package com.codeark.wicketguicealt;

import org.apache.wicket.Page;
import org.apache.wicket.guice.GuiceComponentInjector;
import org.apache.wicket.protocol.http.WebApplication;

import com.google.inject.Injector;

public class WicketGuiceApp extends WebApplication {
	
	private transient Injector injector;
	
	public WicketGuiceApp(Injector injector) {
		this.injector = injector;		
	}
	
	@Override
	protected void init() {		
		addComponentInstantiationListener(new GuiceComponentInjector(this, injector));
	}

	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}
}
