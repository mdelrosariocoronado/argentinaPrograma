
package com.argentinaPrograma.portfolio.Service;

import com.argentinaPrograma.portfolio.Entity.Persona;
import com.argentinaPrograma.portfolio.Interface.InterfPersonaService;
import com.argentinaPrograma.portfolio.Repository.InterfPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplemPersonaService implements InterfPersonaService{

    @Autowired InterfPersonaRepository interfpersonaRepository;
    
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = interfpersonaRepository.findAll() ;
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        interfpersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
         interfpersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona = interfpersonaRepository.findById(id).orElse(null);
       return persona;
    }
    
    
}
