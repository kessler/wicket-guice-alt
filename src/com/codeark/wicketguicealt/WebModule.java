package com.codeark.wicketguicealt;

import java.util.HashMap;
import java.util.Map;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.protocol.http.WicketFilter;

import com.google.inject.servlet.ServletModule;

public class WebModule extends ServletModule {
	
	@Override
	protected void configureServlets() {
		bind(WebApplication.class).toProvider(WicketGuiceAppProvider.class);
		
		// avoids "Error initializing WicketFilter - you have no <filter-mapping> element..." 
		// IllegalArgumentException
		Map<String, String> params = new HashMap<String, String>();		
		params.put(WicketFilter.FILTER_MAPPING_PARAM, "/*");
		
		filter("/*").through(WicketGuiceFilter.class, params);
	}	
}