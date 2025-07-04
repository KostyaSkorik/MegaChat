package by.kostya.megachat.mapper;


import by.kostya.megachat.db.entity.User;
import by.kostya.megachat.dto.UserReadDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserReadMapper {

    UserReadDto toDTO(User user);
}
