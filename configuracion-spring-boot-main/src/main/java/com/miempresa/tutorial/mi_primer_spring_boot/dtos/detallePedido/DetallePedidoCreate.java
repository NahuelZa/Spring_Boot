package com.miempresa.tutorial.mi_primer_spring_boot.dtos.detallePedido;

import com.miempresa.tutorial.mi_primer_spring_boot.entity.Categoria;
import com.miempresa.tutorial.mi_primer_spring_boot.entity.DetallePedido;
import com.miempresa.tutorial.mi_primer_spring_boot.entity.Pedido;
import com.miempresa.tutorial.mi_primer_spring_boot.entity.Producto;
import lombok.Builder;

import java.math.BigDecimal;
@Builder
public record DetallePedidoCreate(
        int cantidad,
        BigDecimal subtotal,
        //relacion a producto
        Long idProducto,
        //relacion a pedido
        Long idPedido,
        Boolean activo
){

}
