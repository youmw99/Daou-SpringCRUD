package com.daou.kr.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class DataBaseConfig {

/////application.yml에 설정한 정보를 가져와 dataSource 빈 생성
@Primary
@Bean(name = "dataSource")
@ConfigurationProperties(prefix = "spring.datasource")
public DataSource dataSource() {
  return DataSourceBuilder.create().build();
}


@Primary
@Bean(name = "sqlSessionFactory")
public SqlSessionFactory sqlSessionFactoryBean(
      @Autowired @Qualifier("dataSource") DataSource dataSource,
      ApplicationContext applicationContext) throws Exception {
  SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
  factoryBean.setDataSource(dataSource);
  factoryBean
          .setConfigLocation(applicationContext.getResource("classpath:/mybatis-config.xml"));
  factoryBean
          .setMapperLocations(applicationContext.getResources("classpath:/mapper/*.xml"));
  return factoryBean.getObject();
}

@Primary
@Bean(name = "sqlSession")
public SqlSessionTemplate sqlSession(
      @Autowired @Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
  return new SqlSessionTemplate(sqlSessionFactory);
}

@Primary
@Bean(name = "transactionManager")
public DataSourceTransactionManager transactionManager(
      @Autowired @Qualifier("dataSource") DataSource dataSource) {
  return new DataSourceTransactionManager(dataSource);
}


}
