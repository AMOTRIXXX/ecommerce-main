package com.example.ecommerce.model;





import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "categorias")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Categoria 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotBlank(message = "El nombre de la categoría no puede estar vacío")
    private String nombre;

    private Boolean destacado;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    @Valid
    @OrderBy("nombre ASC")
    private List<Subcategoria> subcategorias = new ArrayList<>();
}
