package com.me.springdata;

import org.hibernate.cfg.Environment;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

public class JPAConfig {
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/testDatabase");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("123456");
        return driverManagerDataSource;
    }

    private final Properties getHibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");//hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        hibernateProperties.setProperty(Environment.HBM2DDL_AUTO, "create-drop");//hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
        hibernateProperties.setProperty(Environment.SHOW_SQL, "true");//hibernateProperties.setProperty("hibernate.show_sql", "true");
        return hibernateProperties;
    }

    public LocalContainerEntityManagerFactoryBean getLocalContainerEntityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        factoryBean.setDataSource(getDataSource());
        factoryBean.setPackagesToScan("com.me.springdata");
        return factoryBean;
    }


//    @Bean
//    @Autowired
//    public DataSourceTransactionManager transactionManager(DataSource ds) {
//        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
//        txManager.setDataSource(ds);
//        return txManager;
//    }
//
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setPackagesToScan(new String[]{"com.padisarinc.entities"});
//        sessionFactory.setHibernateProperties(hibernateProperties());
//        return sessionFactory;
//    }
//

}
