package fullstackcrud.edu.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fullstackcrud.edu.models.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
    
}
