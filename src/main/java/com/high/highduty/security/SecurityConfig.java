package com.high.highduty.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author lxl
 * @date 2023/6/27 15:27
 */
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // CRSF禁用，因为不使用session
                .csrf().disable()
                //过滤请求
                .authorizeHttpRequests((authz) -> authz
                        /*------------测试访问接口------------*/
                        .antMatchers("/test/**").permitAll()

                        //除上面外的所有请求全部需要鉴权认证
                        .anyRequest().authenticated()
                )
                .headers().frameOptions().disable();

        return http.build();
    }

}
