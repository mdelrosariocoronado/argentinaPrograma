
package com.argentinaPrograma.portfolio.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max =50, message = "No cumple con la longuitud")
    private String name;
    @NotNull
    @Size(min = 1, max =50, message = "No cumple con la longuitud")
    
    private String lastname;
    
    @Size(min = 1, max =70, message = "No cumple con la longuitud")
    private String img;        
    
    
}
