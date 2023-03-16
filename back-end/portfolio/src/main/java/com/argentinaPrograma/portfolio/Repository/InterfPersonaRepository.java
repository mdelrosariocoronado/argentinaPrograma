
package com.argentinaPrograma.portfolio.Repository;

import com.argentinaPrograma.portfolio.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfPersonaRepository  extends JpaRepository <Persona, Long> {
    
}
