package com.leong.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.sql.DataSource;

/**
 * @author leongfeng created on 2017-11-02.
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("SELECT * FROM User WHERE username = ?")
                .authoritiesByUsernameQuery("SELECT username, 'ROLE_USER' FROM User WHERE username = ?")
                .passwordEncoder(new StandardPasswordEncoder("123456"));

    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/login")
            .and()
            .httpBasic()
                .realmName("Spittr")
            .and()
            .authorizeRequests()
                .antMatchers("/spitters/me").authenticated()
                .antMatchers(HttpMethod.POST, "/spittles").authenticated()
                .anyRequest().permitAll()
                .and()
            .requiresChannel()
                // 需要https
                .antMatchers("/apitter/form").requiresSecure()
            .and()
            .rememberMe()
                .tokenValiditySeconds(2419200)
                .key("spittrKey")
            .and()
            .logout()
                .logoutSuccessUrl("/")
                .logoutUrl("/signOut");

    }

}
