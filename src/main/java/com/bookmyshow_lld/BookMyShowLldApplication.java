package com.bookmyshow_lld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowLldApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowLldApplication.class, args);
    }

}
