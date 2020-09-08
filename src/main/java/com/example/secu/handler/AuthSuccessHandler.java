package com.example.secu.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

 
@Component
public class AuthSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
    
    private static final Logger logger = LoggerFactory.getLogger(AuthSuccessHandler.class);
    
 
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException{
      
        logger.info("::::::::::::::::::::::::::::: 로그인 성공 ::::::::::::::::::::::::::::: ");
        String id = "";
        try {
            
//            securityService.setInsertLoginLog(loginLog);
        	System.out.println("로그인 성공");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        super.setDefaultTargetUrl("/loginSuccess");
        super.onAuthenticationSuccess(request, response, authentication);
    }
 
}