package com.example.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LogFilter extends OncePerRequestFilter {

    private static Logger LOG = LoggerFactory.getLogger(LogFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        LOG.info(request.getRequestURI());
        LOG.debug(request.getRequestURI());
        filterChain.doFilter(request, response);
    }
}
