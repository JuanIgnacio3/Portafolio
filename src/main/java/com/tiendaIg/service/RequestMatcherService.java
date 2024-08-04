package com.tiendaIg.service;

import com.tiendaIg.domain.RequestMatcher;
import java.util.List;


public interface RequestMatcherService {
    
    public List<RequestMatcher> getAllRequestMatchers();
    
    public RequestMatcher getRequestMatcher(RequestMatcher requestMatcher);
    
    public void save(RequestMatcher requestMatcher);
    
    public void delete(RequestMatcher requestMatcher);
	
}
