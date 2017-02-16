package com.zido.bingo.common.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.util.StringUtils;
import com.zido.bingo.common.prop.SourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * 数据源配置，使用druid数据库连接池.
 * Date: 2017/2/16 0016
 * Time: 10:12
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>.
 * @version 1.0.0
 */
@Configuration
@EnableConfigurationProperties(SourceProperties.class)
public class DataSourceConfiguration implements EnvironmentAware {
    private Environment environment;
    @Resource
    private SourceProperties sourceProperties;
    /**
     * Set the {@code Environment} that this object runs in.
     *
     * @param environment 环境
     */
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Bean(initMethod = "init",destroyMethod = "close")
    public DruidDataSource getDataSource() throws SQLException {
        if (StringUtils.isEmpty(sourceProperties.getUrl())) {
            System.out.println("数据库连接池配置错误，"
                    + " 请检查spring配置文件，当前位置："
                    + Arrays.toString(environment.getActiveProfiles()));
            throw new ApplicationContextException(
                    "数据库连接池配置错误");
        }
        System.out.println(sourceProperties);
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(sourceProperties.getDriverClassName());
        druidDataSource.setUrl(sourceProperties.getUrl());
        druidDataSource.setUsername(sourceProperties.getUsername());
        druidDataSource.setPassword(sourceProperties.getPassword());
        druidDataSource.setInitialSize(sourceProperties.getInitialSize());
        druidDataSource.setMinIdle(sourceProperties.getMinIdle());
        druidDataSource.setMaxActive(sourceProperties.getMaxActive());
        druidDataSource.setMaxWait(sourceProperties.getMaxWait());
        druidDataSource.setTimeBetweenEvictionRunsMillis(sourceProperties.getTimeBetweenEvictionRunsMillis());
        druidDataSource.setMinEvictableIdleTimeMillis(sourceProperties.getMinEvictableIdleTimeMillis());
        druidDataSource.setValidationQuery(sourceProperties.getValidationQuery());
        druidDataSource.setTestWhileIdle(sourceProperties.getTestWhileIdle());
        druidDataSource.setTestOnBorrow(sourceProperties.getTestOnBorrow());
        druidDataSource.setTestOnReturn(sourceProperties.getTestOnReturn());
        druidDataSource.setPoolPreparedStatements(sourceProperties.getPoolPreparedStatements());
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(sourceProperties.getMaxPoolPreparedStatementPerConnectionSize());
        druidDataSource.setFilters(sourceProperties.getFilters());
        return druidDataSource;
    }

}
