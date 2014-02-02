package com.codeark.wicketguicealt;

import org.apache.wicket.protocol.http.WebApplication;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class WicketGuiceAppProvider implements Provider<WebApplication> {
	
	private final Injector injector;

	@Inject
	public WicketGuiceAppProvider(Injector injector) {
		this.injector = injector;		
	}
	
	@Override
	public WebApplication get() {
		WicketGuiceApp app = new WicketGuiceApp(injector);		
		return app;
	}
}
