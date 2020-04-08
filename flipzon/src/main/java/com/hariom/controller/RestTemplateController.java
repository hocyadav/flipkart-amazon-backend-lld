package com.hariom.controller;


import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.hariom.entity.Rt;
import com.hariom.service.RTService;

@RestController
@RequestMapping(value = "/rt")
public class RestTemplateController {

	@Autowired
	private RTService rtService;
	
	@RequestMapping(method = RequestMethod.POST)
	public String getResponseServerApp(@RequestBody Rt rt) throws JsonParseException, JsonMappingException, IOException, ParseException {
		return rtService.getResponseServerApp(rt);
	}
}
