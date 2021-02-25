package me.lubin.mybatis.starter.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author lubin
 * @create 2021.01.28
 */
@Configuration
@MapperScan(basePackages = {"me.lubin.dao"})
public class MybatisConfig {

    private Resource getConfigLocation() {
        DefaultResourceLoader loader = new DefaultResourceLoader();
        return loader.getResource("classpath:mybatisConfiguration.xml");
    }

    private Resource[] getMapperLocations() throws IOException {
        // 资源类扫描路径设置
        List<String> mapperLocations = new ArrayList<>();
        mapperLocations.add("classpath*:mybatis-mapper/*.xml");
        mapperLocations.add("classpath*:mybatis-mapper/tables/*.xml");
        mapperLocations.add("classpath*:mybatis-mapper/manual/*.xml");
        // 获取资源类
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        // 资源列表
        List<Resource> mapperList = new ArrayList<>();
        for (String row : mapperLocations) {
            Resource[] resources = resolver.getResources(row);
            for (Resource resource : resources) {
                mapperList.add(resource);
            }
        }
        // 转成数组
        Resource[] mappers = new Resource[mapperList.size()];
        mapperList.toArray(mappers);
        return mappers;
    }

    private Interceptor[] getPlugins() {
        // 分页插件属性设置
        Properties properties = new Properties();
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "true");
        PageInterceptor pageInterceptor = new PageInterceptor();
        pageInterceptor.setProperties(properties);
        // 添加插件
        List<Interceptor> pluginList = new ArrayList<>();
        pluginList.add(pageInterceptor);
        // 转成数组
        Interceptor[] plugins = new Interceptor[pluginList.size()];
        pluginList.toArray(plugins);
        return plugins;
    }

    @ConditionalOnBean(name = "dataSource")
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        // configLocation
        sqlSessionFactory.setConfigLocation(this.getConfigLocation());
        // mapper locations
        sqlSessionFactory.setMapperLocations(this.getMapperLocations());
        // mybatis plugins
        sqlSessionFactory.setPlugins(this.getPlugins());
        return sqlSessionFactory.getObject();
    }

    @ConditionalOnBean(name = "dataSource")
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "persistenceExceptionTranslationPostProcessor")
    public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
        return new PersistenceExceptionTranslationPostProcessor();
    }


}
