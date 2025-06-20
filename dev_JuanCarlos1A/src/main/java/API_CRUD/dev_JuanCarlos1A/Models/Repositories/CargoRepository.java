package API_CRUD.dev_JuanCarlos1A.Models.Repositories;

import API_CRUD.dev_JuanCarlos1A.Entities.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<CargoEntity, Long> {
}
