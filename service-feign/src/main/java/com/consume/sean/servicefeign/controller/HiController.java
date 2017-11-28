package com.consume.sean.servicefeign.controller;

import com.consume.sean.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sean on 2017/10/17.
 *
 * @author sean
 * @desc
 * @date 2017/10/17 19:45.
 */

@RestController
public class HiController {

	@Autowired
	SchedualServiceHi schedualServiceHi;
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String sayHi(@RequestParam String name){
		return schedualServiceHi.sayHiFromClientOne(name);
	}
}
