package com.miempresa.tutorial.mi_primer_spring_boot.entity.repository;


import com.miempresa.tutorial.mi_primer_spring_boot.entity.Categoria;
import com.miempresa.tutorial.mi_primer_spring_boot.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long > {
}
