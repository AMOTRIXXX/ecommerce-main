package com.example.ecommerce.model;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "subcategorias")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Subcategoria 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "El nombre de la subcategoría no puede estar vacío")
    private String nombre;

    @ManyToOne
    @NotNull(message = "Debes asociar una categoría a esta subcategoría")
    private Categoria categoria;
}
