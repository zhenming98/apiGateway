package yzm.example.apigateway.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import yzm.example.apigateway.utils.HttpUtil;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yzm
 * @date 2022/2/22 - 22:00
 */
@Component
public class WebFilter extends OncePerRequestFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        LOGGER.debug("WebFilter " + HttpUtil.getIpAdd(request));
        filterChain.doFilter(request, response);
    }

}
