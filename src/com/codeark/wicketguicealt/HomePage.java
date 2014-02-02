package com.codeark.wicketguicealt;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import com.google.inject.Inject;

public class HomePage extends WebPage {
	
	@Inject private IService service;
	
	public HomePage() {
		add(new Label("label", service.foo()));
	}
	
}
