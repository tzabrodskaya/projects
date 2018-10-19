package com.thinkenterprise.repository.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.repository.RouteRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("com.thinkenterprise")
public class RouteRepositoryTest {
	
	@Autowired
	RouteRepository routeRepository;
	
	@Test
	public void findByDestinationTest() {
		
		List<Route> routes = routeRepository.findByDestination("IAH");
		assertEquals(1,routes.size());
		assertEquals(routes.get(0).getDeparture(), "MUC");
		assertEquals(routes.get(0).getFlightNumber(), "LH7902");
		assertEquals(routes.get(0).getDestination(), "IAH");
	}
	
	@Test
	public void saveTest() {
		Route route = new Route("LH8902", "MUC", "IAH");
		
		List<Route> routes = (List<Route>) makeCollection(routeRepository.findAll());
		int countBefore = routes.size();
		routeRepository.save(route);
		
		routes = (List<Route>) makeCollection(routeRepository.findAll());
		assertEquals(routes.size(), countBefore+1);
		
	}

	public static <E> Collection<E> makeCollection(Iterable<E> iter) {
	    Collection<E> list = new ArrayList<E>();
	    for (E item : iter) {
	        list.add(item);
	    }
	    return list;
	}
}
