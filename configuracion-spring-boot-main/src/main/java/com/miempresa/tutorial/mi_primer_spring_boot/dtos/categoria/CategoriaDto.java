package com.miempresa.tutorial.mi_primer_spring_boot.dtos.categoria;

import com.miempresa.tutorial.mi_primer_spring_boot.entity.Categoria;

public record CategoriaDto(
        Long id,
        String nombre,
        String desciption
) {
    public static CategoriaDto toDto(Categoria categoria){
    return new CategoriaDto(categoria.getId(),categoria.getNombre(),categoria.getDescription());
    }
}
