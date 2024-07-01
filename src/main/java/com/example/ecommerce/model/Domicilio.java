package com.example.ecommerce.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "domicilios")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Domicilio extends Direccion
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    private Usuario usuario;

    private Boolean principal;
}
