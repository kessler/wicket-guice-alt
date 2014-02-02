package com.codeark.wicketguicealt;

public class ServiceImpl implements IService {

	@Override
	public String foo() {
		return "Testing 123 - this string is from an implementation of IService bound and injected by Guice";
	}
}
