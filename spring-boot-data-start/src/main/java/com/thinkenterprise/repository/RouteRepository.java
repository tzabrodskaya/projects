package com.thinkenterprise.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thinkenterprise.domain.route.Route;

public interface RouteRepository extends CrudRepository<Route, Long> {
	
	List<Route> findByDestination(String destination);
}


