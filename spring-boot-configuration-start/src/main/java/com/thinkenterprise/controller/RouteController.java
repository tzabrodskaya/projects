package com.thinkenterprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.service.RouteService;

@RestController
public class RouteController {

	@Autowired
	RouteService routeService;
	
	@RequestMapping(produces=MediaType.APPLICATION_XML_VALUE,value="/getAllRouting")
	public Iterable<Route> getAll() {
		return routeService.getAll();
	}
}
