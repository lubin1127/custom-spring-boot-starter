package me.lubin.web.starter.config;

import me.lubin.web.starter.MyDefaultErrorAttributes;
import me.lubin.web.starter.MyDefaultHandlerExceptionResolver;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lubin
 * @create 2021.01.28
 */
@Configuration
public class DefaultDispatcherConfig {

    //@Bean
    //public ErrorAttributes errorAttributes() {
    //    return new MyDefaultErrorAttributes();
    //}

    @Bean
    public MyDefaultHandlerExceptionResolver myDefaultHandlerExceptionResolver() {
        Set<Class<? extends Exception>> customExceptionSet = new HashSet<>();
        return new MyDefaultHandlerExceptionResolver(customExceptionSet);
    }

}
