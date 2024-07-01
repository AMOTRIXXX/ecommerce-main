package com.example.ecommerce.model;




import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "localidades")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Localidad 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Debes asignar un nombre a la localidad")
    private String nombre;

    @ManyToOne
    @NotNull(message = "Debes relacionar esta localidad con una provincia")
    private Provincia provincia;
}
