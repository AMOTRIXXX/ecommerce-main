package com.example.ecommerce.model;





import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "carritos")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Carrito 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @NotNull(message = "No hay un usuario asociado a este item")
    private Usuario usuario;

    @ManyToOne
    @NotNull(message = "No hay un producto asociado a este item")
    private Producto producto;
    
    @NotNull(message = "Debes ingresar la cantidad de productos")
    @Min(value = 1, message = "Debes agregar al menos {value} producto")
    private Integer cantidad;


    // Obtiene el precio total sin aplicar descuentos (precio * cantidad)
    public Double calcularPrecioTotal() {
        return (this.producto.getPrecio() * cantidad);
    }

    // Obtiene el precio total aplicando descuentos (precioFinal * cantidad)
    public Double calcularPrecioFinal() {
        return (this.producto.getPrecioFinal() * cantidad);
    }

    // Obtiene la diferencia entre el precio total y descuento total
    public Double calcularDescuentoTotal() {
        return this.calcularPrecioTotal() - this.calcularPrecioFinal();
    }
}
