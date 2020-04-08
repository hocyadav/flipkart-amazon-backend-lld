package com.hariom.service;

import java.io.IOException;
import java.util.Arrays;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hariom.entity.Rt;

@Service
public class RTService {

	@Autowired
	RestTemplate restTemplate;
	
	public String getResponseServerApp(Rt rt) throws JsonParseException, JsonMappingException, IOException, ParseException {
		//1. rest template
		//2. httpheader obj
		//3. http entity obj
		//4. call exchange(url, method, entityObj, class);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		//headers accept other inputs
		

		HttpEntity<Rt> entity = new HttpEntity<Rt>(headers);
		
		ResponseEntity<String> obj = restTemplate.exchange("http://localhost:4567/tdf/api/sendTransaction", 
														HttpMethod.POST, 
														entity, 
														String.class);
		
//		ResponseEntity<IdEvidence> obj2 = restTemplate.exchange("http://localhost:4567/tdf/api/sendTransaction", 
//				HttpMethod.POST, 
//				entity, 
//				IdEvidence.class);
//
//		System.out.println(obj2.getStatusCode());
//		System.out.println(obj2.getHeaders());
		
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(obj.getBody());
		System.out.println(json);
		
		return obj.getBody();
		
	}
}
