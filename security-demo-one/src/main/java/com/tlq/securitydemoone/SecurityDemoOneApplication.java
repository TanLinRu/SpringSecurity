package com.tlq.securitydemoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecurityDemoOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityDemoOneApplication.class, args);
    }

//    @Bean
//    public static PasswordEncoder noOpPasswordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }

}
