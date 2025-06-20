package API_CRUD.dev_JuanCarlos1A.Models.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @NotBlank
public class CargoDTO {

    private Long id;
    private String cargo;
}
