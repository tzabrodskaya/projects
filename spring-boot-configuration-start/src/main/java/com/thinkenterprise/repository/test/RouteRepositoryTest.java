package com.thinkenterprise.repository.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thinkenterprise.domain.route.Route;
import com.thinkenterprise.repository.RouteRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RouteRepositoryTest {
	
	@Autowired
	RouteRepository routeRepository;
	
	@Test
	public void testRouteCoute() {
		
		int result = 0;
		for(Route route: routeRepository.getAll()) {
			result++;
		}
		
		assertEquals(result, 2);
	}
}
