package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cars")
public class ToController {
	@Autowired
    private To_information_Repository car;

    @RequestMapping(value = "/getto", method = RequestMethod.GET)
    public List<To_information> getTo(@RequestParam("to") int to, @RequestParam("car") String name){
    	return car.getTo(to,name);
    }
    @RequestMapping(value = "/getcar", method = RequestMethod.GET)
    public CarNames[] getCars() {
    	return car.getCar();
    }
}
