package fullstackcrud.edu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fullstackcrud.edu.interfaceServ.IpersonaService;
import fullstackcrud.edu.interfaces.IPersona;
import fullstackcrud.edu.models.Persona;

@Service
public class PersonaService implements IpersonaService {

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> lista() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarId'");
    }

    @Override
    public int save(Persona persona) {
        int res = 0;
        Persona p = data.save(persona); 
        if (!p.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
