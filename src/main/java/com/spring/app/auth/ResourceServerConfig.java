package com.spring.app.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        /*
         * Esto es para que un endpoint pueda ser visible sin necesidad de autenticarte.
         */
        http.authorizeRequests().antMatchers(HttpMethod.GET, "api/productos").permitAll()
        .anyRequest().authenticated();
    }
}
