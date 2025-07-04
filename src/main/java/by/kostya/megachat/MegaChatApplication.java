package by.kostya.megachat;

import by.kostya.megachat.mapper.UserReadMapper;
import by.kostya.megachat.mapper.UserReadMapperImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MegaChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MegaChatApplication.class, args);
    }

}
