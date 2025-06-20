package API_CRUD.dev_JuanCarlos1A.Services;

import API_CRUD.dev_JuanCarlos1A.Entities.UserEntity;
import API_CRUD.dev_JuanCarlos1A.Models.DTO.UserDTO;
import API_CRUD.dev_JuanCarlos1A.Models.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository objRepo;

    public List<UserDTO> getDataUser(){
        List<UserEntity> usuarios = objRepo.findAll(); //Nos quedamos aca
        return null;
    }
}
