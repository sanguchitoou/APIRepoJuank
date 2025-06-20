package API_CRUD.dev_JuanCarlos1A.Services;

import API_CRUD.dev_JuanCarlos1A.Entities.UserEntity;
import API_CRUD.dev_JuanCarlos1A.Models.DTO.UserDTO;
import API_CRUD.dev_JuanCarlos1A.Models.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository objRepo;

    public List<UserDTO> getAllUsers(){

        List<UserEntity> usuarios = objRepo.findAll(); //Nos quedamos aca
        return usuarios.stream().map(this::convertirAUsuarioDTO).collect(Collectors.toList());
    }

    public UserDTO convertirAUsuarioDTO(UserEntity usuario){
        UserDTO objUserDTO = new UserDTO();
        objUserDTO.setId(usuario.getId());
        objUserDTO.setFirstName(usuario.getFirstName());
        objUserDTO.setLastName(usuario.getLastName());
        objUserDTO.setIdExpoGroup(usuario.getIdExpoGroup());
        objUserDTO.setIdRol(usuario.getIdRol());
        objUserDTO.setEmail(usuario.getEmail());
        objUserDTO.setPassword(usuario.getPassword());
        objUserDTO.setIdPosition(usuario.getIdPosition());
        return objUserDTO;
    }

}
