package com.thinkenterprise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.thinkenterprise.repository.driver.DefaultRouteRepositoryDriver;
import com.thinkenterprise.repository.driver.RouteRepositoryDriver;
import com.thinkenterprise.repository.driver.TestRouteRepositoryDriver;

@Configuration
public class AppConfiguration {

	@Bean
	public RouteRepositoryDriver routeRepositoryDriver() {
		return new DefaultRouteRepositoryDriver();
	}
	
	@Bean
	@Profile("test")
	public RouteRepositoryDriver routeRepositoryDriverTest() {
		return new TestRouteRepositoryDriver();
	}
}
