package com.example.demo.filters;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

@Component
@Order(1)
public class AMPEmailFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //Get email from AMP request Header
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse myResponse = (HttpServletResponse) response;
        HttpServletResponseWrapper responseWrapper = new HttpServletResponseWrapper(myResponse);

        if(httpRequest.getHeader("AMP-Email-Sender") != null){
            //Set AMP response headers
            responseWrapper.addHeader("AMP-Email-Allow-Sender", httpRequest.getHeader("AMP-Email-Sender"));
        }else if(httpRequest.getHeader("origin") != null &&
                httpRequest.getParameter("__amp_source_origin") != null){

            responseWrapper.addHeader("Access-Control-Allow-Origin",httpRequest.getHeader("origin"));
            responseWrapper.addHeader("AMP-Access-Control-Allow-Source-Origin", httpRequest.getHeader("__amp_source_origin"));
            responseWrapper.addHeader("Access-Control-Expose-Headers","AMP-Access-Control-Allow-Source-Origin");
        }

        chain.doFilter(request,myResponse);
    }

}
