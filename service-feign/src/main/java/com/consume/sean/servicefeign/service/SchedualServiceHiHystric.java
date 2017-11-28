package com.consume.sean.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * Created by sean on 2017/11/28 9:37.
 *
 * @desc
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}
}
