package com.thinkenterprise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.repository.RouteRepository;

@Service
public class RouteService {

	@Autowired
	RouteRepository routeRepository;
	
	public Iterable<Route> getAll() {
		return routeRepository.getAll();
	}
}
