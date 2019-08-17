package com.tlq.securitydemoone.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import javax.security.auth.login.Configuration;

/**
 * @Description: spring security配置类
 * @Author: TanLinQuan
 * @Date: 2019/8/17 11:17
 * @Version: V1.0
 **/

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/","/home").permitAll()
                    .anyRequest().authenticated()
                .and()
                .formLogin()
                    .loginPage("/login").permitAll()
                .and()
                .logout().permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                    .withUser("user").password("123").roles("USER")
//                    .withUser("user").password("123").roles("{noop}USER")
                .and()
                .passwordEncoder(new Password());
    }
}
