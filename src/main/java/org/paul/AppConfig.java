package org.paul;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.paul")   // scan all the components for us
public class AppConfig {

    /*
    @Bean
    public Vivo getPhone() {
        return new Vivo();
    }

    @Bean
    public MobileProcessor getProcessor() {
        return new MediaTech();
    } */
}
