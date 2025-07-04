package by.kostya.megachat.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserReadDto {
    private Long id;
    private String firstname;
    private String surname;
}
