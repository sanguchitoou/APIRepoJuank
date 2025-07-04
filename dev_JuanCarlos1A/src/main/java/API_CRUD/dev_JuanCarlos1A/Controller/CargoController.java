package API_CRUD.dev_JuanCarlos1A.Controller;

import API_CRUD.dev_JuanCarlos1A.Models.DTO.CargoDTO;
import API_CRUD.dev_JuanCarlos1A.Models.DTO.UserDTO;
import API_CRUD.dev_JuanCarlos1A.Services.CargoService;
import API_CRUD.dev_JuanCarlos1A.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/apiCargo")
public class CargoController {

    //autowirde al service
    @Autowired
    private CargoService crgService;

    //GetMapping para URL dentro de la API, que hará
    @GetMapping("/getDataCargo")
    public List<CargoDTO> getData(){
        return crgService.getAllCargos();
    }
}
