package API_CRUD.dev_JuanCarlos1A.Services;

import API_CRUD.dev_JuanCarlos1A.Entities.CargoEntity;
import API_CRUD.dev_JuanCarlos1A.Entities.UserEntity;
import API_CRUD.dev_JuanCarlos1A.Models.DTO.CargoDTO;
import API_CRUD.dev_JuanCarlos1A.Models.DTO.UserDTO;
import API_CRUD.dev_JuanCarlos1A.Models.Repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CargoService {
    @Autowired
    private CargoRepository objRepo;

    public List<CargoDTO> getAllCargos(){
        List<CargoEntity> cargos = objRepo.findAll(); //Nos quedamos aca
        return cargos.stream().map(this::convertirACargoDTO).collect(Collectors.toList());
    }

    public CargoDTO convertirACargoDTO(CargoEntity cargo){
        CargoDTO objCargoDTO = new CargoDTO();
        objCargoDTO.setId(cargo.getId());
        objCargoDTO.setCargo(cargo.getCargo());
        return objCargoDTO;
    }
}
