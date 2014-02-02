package com.codeark.wicketguicealt;

import com.google.inject.AbstractModule;
import com.google.inject.Module;

public class MyModule extends AbstractModule implements Module {

	@Override
	protected void configure() {
		bind(IService.class).to(ServiceImpl.class);
	}
}
