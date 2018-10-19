package com.thinkenterprise.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.repository.driver.RouteRepositoryDriver;

@Repository
public class RouteRepository {

	@Autowired
	RouteRepositoryDriver routeRepositoryDriver;
	
	public Iterable<Route> getAll() {
		return routeRepositoryDriver.getRouteList();
	}
	
}
