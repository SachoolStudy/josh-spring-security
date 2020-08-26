package com.example.secu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.secu.sample.service.UserService;

@Configuration
@EnableWebSecurity  //웹보안 설정
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserService userService;
	
	@Override
	public void configure(WebSecurity http) throws Exception{
        http.ignoring().antMatchers("/resources/**");
    }
	
	@Override
    protected void configure(HttpSecurity http) throws  Exception {
        http.authorizeRequests()
        		.anyRequest()
        		.authenticated()
        		.and()
    		.formLogin()
    			//.loginPage("/login")
                //.loginProcessingUrl("/login")
                .failureUrl("/login?error=true")
                .defaultSuccessUrl("/loginSuccess", true)
                .usernameParameter("username")
                .passwordParameter("password")
                .permitAll()
                .and()
            .logout()
            	.deleteCookies("remove")
                .invalidateHttpSession(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login")
                .and()
            .csrf()
            	.disable();
    }

}
