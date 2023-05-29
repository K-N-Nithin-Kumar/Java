package com.telusko.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UrlEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// @Column(unique = true)
	private String url;

	private String surl;

	public UrlEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UrlEntity(String url, String surl) {
		super();

		this.url = url;
		this.surl = surl;
	}

	@Override
	public String toString() {
		return "UrlEntity [id=" + id + ", url=" + url + ", surl=" + surl + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSurl() {
		return surl;
	}

	public void setSurl(String surl) {
		this.surl = surl;
	}

}
