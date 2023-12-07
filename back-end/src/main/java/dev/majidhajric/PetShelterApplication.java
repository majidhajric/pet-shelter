package dev.majidhajric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class PetShelterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetShelterApplication.class, args);
    }
}
