package fullstackcrud.edu.interfaceServ;

import java.util.List;
import java.util.Optional;

import fullstackcrud.edu.models.Persona;

public interface IpersonaService {
    public List<Persona> lista();
    public Optional<Persona> listarId(int id);
    public int save(Persona persona);
    public void delete(int id);
}
