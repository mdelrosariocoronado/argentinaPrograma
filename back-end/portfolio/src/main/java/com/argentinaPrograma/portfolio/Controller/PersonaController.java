
package com.argentinaPrograma.portfolio.Controller;

import com.argentinaPrograma.portfolio.Entity.Persona;
import com.argentinaPrograma.portfolio.Interface.InterfPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired InterfPersonaService interfpersonaService;
    
    @GetMapping ("personas/traer")
    
    public List<Persona> getPersona (){
        return interfpersonaService.getPersona();
    }
     
    @PostMapping("personas/crear")
    public String createPersona(@RequestBody Persona persona){
        interfpersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interfpersonaService.deletePersona(id);
        return "La persona fue borrada correctamente";
    }
    
    @PutMapping ("/persona/editar/{id}") 
    public Persona editPersona(@PathVariable Long id, 
            @RequestParam("name") String newName,
            @RequestParam("lastname") String newLastname,
            @RequestParam("img") String newImg)
    {
        Persona persona = interfpersonaService.findPersona(id);
        persona.setName(newName);
        persona.setLastname(newLastname);
        persona.setImg(newImg);
        
        interfpersonaService.savePersona(persona);
        return persona;
    }
}
