package kr.sadalmelik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        //TODO object배열 단순화 시키기.
        SpringApplication.run(new Object[]{
                Application.class,
                ForumWebMvcConfiguration.class
        }, args);
    }
}
