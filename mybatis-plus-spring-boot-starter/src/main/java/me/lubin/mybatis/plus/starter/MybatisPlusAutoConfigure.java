package me.lubin.mybatis.plus.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lubin
 * @date 2021/6/5
 */
@Configuration
@MapperScan("me.lubin.mybatis.plus.mapper")
public class MybatisPlusAutoConfigure {
}
