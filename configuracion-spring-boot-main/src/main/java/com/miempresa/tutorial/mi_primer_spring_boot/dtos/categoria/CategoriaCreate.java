package com.miempresa.tutorial.mi_primer_spring_boot.dtos.categoria;

import com.miempresa.tutorial.mi_primer_spring_boot.entity.Categoria;
import lombok.Builder;

@Builder
public record CategoriaCreate(
        String nombre,
        String description
) {
    public Categoria toEntity(){
        return new Categoria(this.nombre,this.description);
    }
}
