package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class To_information_Repository {
	@Autowired
    private JdbcTemplate jdbcTemplate;
   
    public List<To_information> getTo(int to, String car){
    	String carname ="\""+ car+"\"";
    	return jdbcTemplate.query("SELECT * FROM "+carname+" WHERE\"To\"=? ORDER BY \"Replace\" DESC", new To_information_Mapper(),to);
    }
    public CarNames[] getCar() {
    	List<CarNames> names = jdbcTemplate.query("SELECT \"table_name\" FROM INFORMATION_SCHEMA.TABLES WHERE \"table_schema\" = 'public'", new CarNamesMapper());
    	CarNames[] cars = new CarNames[names.size()];
    	for(int i = 0;i<cars.length;i++) {
    		cars[i] = names.get(i);
    	}
    	return cars;
    }
}
