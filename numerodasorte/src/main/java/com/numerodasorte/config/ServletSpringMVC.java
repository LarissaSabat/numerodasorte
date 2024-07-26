package com.numerodasorte.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfig.class, JPAConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}


