package com.miempresa.tutorial.mi_primer_spring_boot.service;

import com.miempresa.tutorial.mi_primer_spring_boot.dtos.detallePedido.DetallePedidoCreate;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.detallePedido.DetallePedidoDto;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.pedido.PedidoDto;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.pedido.PedidoEdit;
import com.miempresa.tutorial.mi_primer_spring_boot.entity.Pedido;

import java.util.List;

public interface PedidoService {
    public PedidoDto save (Pedido pedido);
    public PedidoDto findById(Long id);
    public List<PedidoDto> findAll();
    public PedidoDto update (PedidoEdit pedidoEdit, Long idPedido);
    public void deleteById(Long id);
}