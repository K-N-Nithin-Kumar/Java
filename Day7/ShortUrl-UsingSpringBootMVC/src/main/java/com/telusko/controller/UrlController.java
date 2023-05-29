package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.service.UrlService;

@RestController
public class UrlController {

	@Autowired
	private UrlService urlService;

	@GetMapping("/url")
	public ResponseEntity<String> getShortUrl(@RequestBody String url) {
		String surl = urlService.generateUrl(url);
		return new ResponseEntity<String>(surl, HttpStatus.ACCEPTED);
	}

}
