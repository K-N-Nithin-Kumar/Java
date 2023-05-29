package com.telusko.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.entities.UrlEntity;

@Repository
public interface UrlDao extends JpaRepository<UrlEntity, Integer> {
	Optional<UrlEntity> findByUrl(String url);

}
