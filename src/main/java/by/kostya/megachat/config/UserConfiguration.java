package by.kostya.megachat.config;


import by.kostya.megachat.mapper.UserReadMapper;
import by.kostya.megachat.mapper.UserReadMapperImpl;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    public UserReadMapper userReadMapper(){
        return new UserReadMapperImpl();
    }
}
