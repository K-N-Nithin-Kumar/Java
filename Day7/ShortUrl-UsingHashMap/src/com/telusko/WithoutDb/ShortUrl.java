package com.telusko.WithoutDb;

import java.util.HashMap;

public class ShortUrl {

	public static void main(String[] args) {

		String ourl = "https://www.youtube.com/watch?v=2Gik4bFYJbM";

		UrlService urlService = new UrlService();
		String nurl = "";
		urlService.fillUrls(ourl);
		HashMap<String, String> store = new HashMap<>();

		do {
			if (store.containsKey(ourl)) {
				nurl = store.get(ourl);
				System.out.println("Already exist");
				break;
			} else {
				nurl = urlService.generateUrl(ourl);
				store.put(ourl, nurl);
				System.out.println("created");
			}
		} while (urlService.urls.contains(nurl));

		System.out.println("telu.ko/" + nurl);
	}

}
