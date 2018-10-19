package com.thinkenterprise.controller.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.thinkenterprise.domain.route.Route;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class RouteControllerTest {

	@Autowired
	TestRestTemplate testRestTemplate;
	
	@Test
	public void findByDepartureTest() {
		
		ResponseEntity<Route> result =  testRestTemplate.getForEntity("/routes?departure=MUC", Route.class);
		assertNotNull(result);
		
		/*List<Route> routes =  (List<Route>) makeCollection(routesIt);
		assertEquals(1,routes.size());
		assertEquals(routes.get(0).getDeparture(), "MUC");
		assertEquals(routes.get(0).getFlightNumber(), "LH7902");
		assertEquals(routes.get(0).getDestination(), "IAH");*/
	}
	
	public static <E> Collection<E> makeCollection(Iterable<E> iter) {
	    Collection<E> list = new ArrayList<E>();
	    for (E item : iter) {
	        list.add(item);
	    }
	    return list;
	}
}
