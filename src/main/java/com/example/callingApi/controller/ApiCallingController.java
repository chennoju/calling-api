package com.example.callingApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.callingApi.model.PostOffice;
import com.example.callingApi.model.PostOfficeMain;
@RestController
public class ApiCallingController {

	
	@Autowired
	RestTemplate resttemplate;
	@Autowired
	WebClient.Builder webclient;
	
	@GetMapping(value="/pincode/{aid}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PostOffice>> getDetailsByPincode(@PathVariable("aid") String pincode) {
		System.out.println(pincode);
		String url="https://api.postalpincode.in/pincode/"+pincode;
		
		//local - api 
		
	//	PostOfficeMain obj[]=resttemplate.getForObject(url, PostOfficeMain[].class);
		
		PostOfficeMain obj[]=webclient.build()
				.get()
				.uri(url)
				.retrieve()
				.bodyToMono(PostOfficeMain[].class)
				.block();
		
		
		return new ResponseEntity<>(obj[0].call()	,HttpStatus.OK);
	}
	
	
}
