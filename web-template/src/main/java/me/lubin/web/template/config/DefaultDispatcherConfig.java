package me.lubin.web.template.config;

import me.lubin.mysql.starter.config.NormalDataSource;
import me.lubin.mysql.starter.config.ProdDataSource;
import me.lubin.web.starter.MyDefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * @author lubin
 * @date 2021/6/5
 */
@Configuration
public class DefaultDispatcherConfig {

    @Bean
    public ErrorAttributes errorAttributes() {
        return new MyDefaultErrorAttributes();
    }

    @Profile({"dev", "test"})
    @Bean
    public DataSource dataSourceDevAndTest() {
        NormalDataSource normalDataSource = new NormalDataSource();
        return normalDataSource.getDataSource();
    }

    @Profile({"prod"})
    @Bean
    public DataSource dataSourceProd() {
        ProdDataSource prodDataSource = new ProdDataSource();
        return prodDataSource.getDataSource();
    }

}
