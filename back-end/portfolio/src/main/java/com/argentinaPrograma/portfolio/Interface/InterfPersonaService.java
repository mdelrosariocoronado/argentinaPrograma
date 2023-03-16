
package com.argentinaPrograma.portfolio.Interface;

import com.argentinaPrograma.portfolio.Entity.Persona;
import java.util.List;


public interface InterfPersonaService {
    //pull list of persona with get
    public List<Persona> getPersona();
    //save object, type=persona
    public void savePersona(Persona persona);
    //delete persona by id
    public void deletePersona(Long id);
    //search people by id
    public Persona findPersona(Long id);
}
