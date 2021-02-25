package me.lubin.mongo.starter.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * @author lubin
 * @create 2021.02.07
 */
@Profile("prod")
@Configuration
public class ProdMongoConfig {

    @Bean
    public ServerAddress serverAddress() {
        return new ServerAddress("ip", 29019);
    }

    @Bean
    public MongoCredential mongoCredential() {
        return MongoCredential.createCredential("username", "database", "password".toCharArray());
    }

    @Bean
    public MongoClientOptions mongoClientOptions() {
        return MongoClientOptions.builder().connectionsPerHost(10).minConnectionsPerHost(5).threadsAllowedToBlockForConnectionMultiplier(5)
                .connectTimeout(10000).maxWaitTime(120000).socketTimeout(0).description("description").maxConnectionIdleTime(1500).maxConnectionLifeTime(0)
                .heartbeatSocketTimeout(1000).heartbeatConnectTimeout(1500).minHeartbeatFrequency(5).heartbeatFrequency(10).build();
    }

    @Bean
    public MongoClient mongoClient(ServerAddress serverAddress, MongoCredential mongoCredential, MongoClientOptions mongoClientOptions) {
        return new MongoClient(serverAddress, mongoCredential, mongoClientOptions);
    }

    @Bean
    public SimpleMongoDbFactory simpleMongoDbFactory(MongoClient mongoClient) {
        return new SimpleMongoDbFactory(mongoClient, "database");
    }

    @Bean
    public MongoMappingContext mongoMappingContext() {
        return new MongoMappingContext();
    }

    @Bean
    public DefaultDbRefResolver defaultDbRefResolver(SimpleMongoDbFactory simpleMongoDbFactory) {
        return new DefaultDbRefResolver(simpleMongoDbFactory);
    }

    @Bean
    public MappingMongoConverter mappingMongoConverter(DefaultDbRefResolver defaultDbRefResolver, MongoMappingContext mongoMappingContext) {
        MappingMongoConverter mappingMongoConverter = new MappingMongoConverter(defaultDbRefResolver, mongoMappingContext);
        DefaultMongoTypeMapper defaultMongoTypeMapper = new DefaultMongoTypeMapper(null, mongoMappingContext);
        mappingMongoConverter.setTypeMapper(defaultMongoTypeMapper);
        return mappingMongoConverter;
    }


    @Bean
    public MongoTemplate mongoTemplate(SimpleMongoDbFactory simpleMongoDbFactory, MappingMongoConverter mappingMongoConverter) {
        return new MongoTemplate(simpleMongoDbFactory, mappingMongoConverter);
    }

}
