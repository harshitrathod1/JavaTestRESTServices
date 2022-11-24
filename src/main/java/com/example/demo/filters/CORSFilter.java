package com.example.demo.filters;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

@Component
public class CORSFilter implements Filter {

/*    @Value("${spring.profiles.active}")
    private String env;*/

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletResponse myResponse = (HttpServletResponse) response;
        HttpServletResponseWrapper responseWrapper = new HttpServletResponseWrapper(myResponse);
        responseWrapper.addHeader("Access-Control-Allow-Origin", "*");
        chain.doFilter(request, myResponse);
    }
}
