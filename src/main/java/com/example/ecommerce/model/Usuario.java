package com.example.ecommerce.model;



import com.example.ecommerce.dto.UsuarioDTO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "usuarios")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class Usuario extends UsuarioDTO
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String password;

    private String role = "USER";
}
