package com.zhang.spring.springbootweb.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "TemplateFilter",urlPatterns = {"*.do"})
public class TemplateFilter implements Filter {

    private Logger log = LoggerFactory.getLogger(TemplateFilter.class);

    public void destroy() {
        log.info("filter destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        log.debug("dofilter start");
        chain.doFilter(req, resp);
        log.debug("dofilter end");
    }

    public void init(FilterConfig config) throws ServletException {
        log.info("filter init");
    }

}
