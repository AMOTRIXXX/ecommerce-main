package com.example.ecommerce.model;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "envios")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Envio extends Direccion
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @NotNull(message = "Debes asociar una orden a este envío")
    private Orden orden;
}
