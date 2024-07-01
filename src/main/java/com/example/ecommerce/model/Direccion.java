package com.example.ecommerce.model;





import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@MappedSuperclass
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public abstract class Direccion 
{
    @ManyToOne
    @NotNull(message = "Debes asignar una localidad a este domicilio")
    private Localidad localidad;

    @NotNull(message = "Debes indicar el código postal")
    @Min(value = 0, message = "El código postal no puede ser menor a {value}")
    private Integer codigoPostal;

    @NotBlank(message = "Debes ingresar el nombre de la calle")
    private String calle;

    @NotNull(message = "Debes ingresar un número de calle")
    @Min(value = 0, message = "El número de calle no puede ser menor a {value}")
    private Integer numeroCalle;

    private String entrecalle1;
    private String entrecalle2;

    @Column(length = 20)
    @Size(max = 20, message = "El piso/departamento no puede tener más de {max} caracteres")
    private String piso_dpto;

    private String indicaciones;
}
