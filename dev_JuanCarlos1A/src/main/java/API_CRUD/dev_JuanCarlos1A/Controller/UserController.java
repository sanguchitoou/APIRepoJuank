package API_CRUD.dev_JuanCarlos1A.Controller;

import API_CRUD.dev_JuanCarlos1A.Models.DTO.UserDTO;
import API_CRUD.dev_JuanCarlos1A.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiUser")
public class UserController {

    //Inyectando la clase UserService
    @Autowired
    private UserService service;


    //GetMapping para URL dentro de la API, que hará
    @GetMapping("/getDataUser")
    public List<UserDTO> getData(){

        return service.getAllUsers();
    }
}
