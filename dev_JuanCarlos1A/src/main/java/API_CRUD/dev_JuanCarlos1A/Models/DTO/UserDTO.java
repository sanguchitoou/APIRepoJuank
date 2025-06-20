package API_CRUD.dev_JuanCarlos1A.Models.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @NotBlank
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private Long idExpoGroup;
    private  Long idRol;
    @Email
    private String email;
    @Size (min = 8, message = "La contraseña debe ser de al menos de 8 caracteres")
    private String password;
    private Long idPosition;
}
