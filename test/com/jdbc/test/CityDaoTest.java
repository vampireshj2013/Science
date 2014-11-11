package com.jdbc.test;

import java.util.List;

import org.junit.Test;

import com.science.dao.CityDao;
import com.science.model.City;
import com.science.model.Maturity;

public class CityDaoTest {
	private CityDao dao=new CityDao();
	
	@Test
	public void searchCity(){
		List<City> result = dao.searchChildCityById(3);
		for(City city:result)
		System.out.println(city.getClassName());
	}
}
