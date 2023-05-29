package com.telusko.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telusko.dao.UrlDao;
import com.telusko.entities.UrlEntity;

@Component
public class UrlService {

	@Autowired
	private UrlDao urlDao;

	Random random = new Random();

	public void addUrl(UrlEntity p) {
		urlDao.save(p);
	}

	public String generateUrl(String ourl) {

		String surl = "";
		Optional<UrlEntity> urlEntityOptional = urlDao.findByUrl(ourl); // Ctrl+2 F

		if (urlEntityOptional.isPresent()) {
			System.out.println("Already exist");
			surl = urlEntityOptional.get().getSurl();

		} else {
			String formatUrl = ourl.replaceAll("[^a-zA-Z0-9]", "");

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i <= formatUrl.length(); i++) {
				int index = random.nextInt(formatUrl.length());
				sb.append(formatUrl.charAt(index));
			}
			System.out.println("created ...");
			surl = sb.toString();

			addUrl(new UrlEntity(ourl, surl));

		}

		return "telu.ko/" + surl;
	}
}
