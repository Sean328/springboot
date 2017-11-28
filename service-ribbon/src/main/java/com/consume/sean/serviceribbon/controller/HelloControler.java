package com.consume.sean.serviceribbon.controller;

import com.consume.sean.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sean on 2017/10/17.
 *
 * @Desc
 * @Author sean
 * @Date 2017/10/17 19:10.
 * @Version
 */
@RestController
public class HelloControler {

	@Autowired
	HelloService helloService;
	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name){
		return helloService.hiService(name);
	}

}
