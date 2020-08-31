package com.zun.springdi.config;

import com.zun.springdi.examplebeans.FakeDataSource;
import com.zun.springdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource({
//        "classpath:datasource.properties",
//        "classpath:jms.properties"
//})
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")
//})
public class PropertyConfig {

//    @Autowired
//    Environment env;

    @Value("${zun.username}")
    String user;

    @Value("${zun.password}")
    String password;

    @Value("${zun.dburl}")
    String url;

    @Value("${zun.jms.username}")
    String jmsUsername;

    @Value("${zun.jms.password}")
    String jmsPassword;

    @Value("${zun.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        fakeDataSource.setUsername(user);
//        fakeDataSource.setUsername(env.getProperty("USERNAME"));
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }

}
