package com.miempresa.tutorial.mi_primer_spring_boot.dtos.producto;

import com.miempresa.tutorial.mi_primer_spring_boot.entity.Categoria;
import com.miempresa.tutorial.mi_primer_spring_boot.entity.Producto;
import lombok.Builder;

import java.math.BigDecimal;
@Builder
public record ProductoCreate(
         String nombre,
         BigDecimal precio,
         String descripcion,
         int stock,
         String Imagen,
         Boolean disponible,

         //relacion a categoria
         Long idCategoria
) {
    public  Producto toEntity(Categoria categoria){
        return new Producto(this.nombre,this.precio,this.descripcion,this.stock,this.Imagen,categoria);

    }
}
