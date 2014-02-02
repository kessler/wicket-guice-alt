package com.codeark.wicketguicealt;

import org.apache.wicket.protocol.http.IWebApplicationFactory;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.protocol.http.WicketFilter;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

@Singleton
public class WicketGuiceFilter extends WicketFilter {

	private final Provider<WebApplication> appsProvider;
	
	@Inject 
	public WicketGuiceFilter(Provider<WebApplication> appsProvider) {
		this.appsProvider = appsProvider;		
	}
	
	@Override
	protected IWebApplicationFactory getApplicationFactory() {
		return new IWebApplicationFactory() {			
			@Override
			public WebApplication createApplication(WicketFilter filter) {				
				return appsProvider.get();
			}
		};
	}	
}
