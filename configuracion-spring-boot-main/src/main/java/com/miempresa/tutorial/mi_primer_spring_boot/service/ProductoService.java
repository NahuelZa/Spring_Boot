package com.miempresa.tutorial.mi_primer_spring_boot.service;

import com.miempresa.tutorial.mi_primer_spring_boot.dtos.producto.ProductoCreate;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.producto.ProductoDto;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.producto.ProductoEdit;

import java.util.List;

public interface ProductoService {
    public ProductoDto save (ProductoCreate productoCreate);
    public ProductoDto findById(Long id);
    public List<ProductoDto> findAll();
    public ProductoDto update (ProductoEdit productoEdit, Long idProducto);
    public void deleteById(Long id);
}
