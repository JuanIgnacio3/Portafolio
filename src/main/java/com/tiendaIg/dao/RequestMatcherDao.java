package com.tiendaIg.dao;

import com.tiendaIg.domain.RequestMatcher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RequestMatcherDao extends JpaRepository<RequestMatcher, Long> {
    
}