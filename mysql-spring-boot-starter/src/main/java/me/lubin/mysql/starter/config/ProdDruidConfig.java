package me.lubin.mysql.starter.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * @author lubin
 * @create 2021.01.28
 */
@Profile({"prod"})
@Configuration
public class ProdDruidConfig {

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://192.168.10.189:12336/zmp?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull");
        dataSource.setUrl("url");
        dataSource.setUsername("username");
        dataSource.setPassword("password");
        dataSource.setMaxActive(500);
        dataSource.setInitialSize(10);
        dataSource.setMaxWait(60000L);
        dataSource.setMinIdle(10);
        dataSource.setRemoveAbandoned(true);
        dataSource.setRemoveAbandonedTimeoutMillis(7200L);
        return dataSource;
    }
}
