package com.numerodasorte.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.numerodasorte.controllers.HomeController;
import com.numerodasorte.daos.SegredoDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses= {com.numerodasorte.controllers.HomeController.class, SegredoDAO.class})
public class AppWebConfig {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver () {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");

		return resolver;
	}

}
