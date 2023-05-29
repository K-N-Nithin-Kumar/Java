package com.telusko.WithoutDb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UrlService {

	Random random = new Random();
	
	
	List<String> urls=new ArrayList<>();
	
	public void fillUrls(String url){
		for(int i=0;i<1000;i++) {
			urls.add(generateUrl(url));
		}
	}

	public String generateUrl(String url) {
		String formatUrl=url.replaceAll("[^a-zA-Z0-9]","");

		StringBuilder sb = new StringBuilder();
		String nurl = "";

		for (int i = 0; i <= formatUrl.length(); i++) {
			int index = random.nextInt(formatUrl.length());
			sb.append(formatUrl.charAt(index));
		}

		nurl = sb.toString();
		return nurl;
	}
}
