package com.nile.springrestcrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SpringRestCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestCrmApplication.class, args);
    }

}
