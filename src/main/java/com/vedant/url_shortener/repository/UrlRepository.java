package com.vedant.url_shortener.repository;

import com.vedant.url_shortener.entity.Url;
import com.vedant.url_shortener.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UrlRepository extends JpaRepository<Url, Long> {

    Optional<Url> findByShortCode(String shortCode);

    List<Url> findAllByUser(User user);

    boolean existsByShortCode(String shortCode);

}