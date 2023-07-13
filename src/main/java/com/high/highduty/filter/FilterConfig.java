package com.high.highduty.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器
 *
 * @author lxl
 * @date 2023/6/29 10:35
 */
@Component
public class FilterConfig implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
    }

}
