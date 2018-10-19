package com.thinkenterprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.repository.RouteRepository;

@RestController
@RequestMapping("/routes")
@ResponseStatus(HttpStatus.OK)
public class RouteController {
	
	@Autowired
	RouteRepository routeRepository;
	
	
	@RequestMapping 
	public Route getRoutes(@RequestParam(value="departure")String departure) {
		 Iterable<Route> result = routeRepository.findByDeparture(departure);	
		 return result.iterator().next();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Route post(@RequestBody @Validated Route route) {
		return routeRepository.save(route);
	}

}
