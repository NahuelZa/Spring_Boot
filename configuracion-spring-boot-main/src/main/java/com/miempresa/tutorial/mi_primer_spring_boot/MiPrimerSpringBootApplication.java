package com.miempresa.tutorial.mi_primer_spring_boot;


import com.miempresa.tutorial.mi_primer_spring_boot.dtos.categoria.CategoriaCreate;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.detallePedido.DetallePedidoCreate;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.pedido.PedidoEdit;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.producto.ProductoCreate;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.producto.ProductoDto;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.usuario.UsuarioCreate;
import com.miempresa.tutorial.mi_primer_spring_boot.dtos.usuario.UsuarioEdit;
import com.miempresa.tutorial.mi_primer_spring_boot.entity.Usuario;
import com.miempresa.tutorial.mi_primer_spring_boot.entity.repository.CategoriaRepository;
import com.miempresa.tutorial.mi_primer_spring_boot.enums.Estado;
import com.miempresa.tutorial.mi_primer_spring_boot.enums.FormaPago;
import com.miempresa.tutorial.mi_primer_spring_boot.enums.Rol;
import com.miempresa.tutorial.mi_primer_spring_boot.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;


@SpringBootApplication
public class MiPrimerSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(MiPrimerSpringBootApplication.class, args);
		ProductoService productoService= context.getBean(ProductoService.class);
		CategoriaService categoriaService = context.getBean(CategoriaService.class);
		DetallePedidoService detallePedidoService = context.getBean(DetallePedidoService.class);
		PedidoService pedidoService = context.getBean(PedidoService.class);
		UsuarioService usuarioService= context.getBean(UsuarioService.class);

		CategoriaCreate c1 = CategoriaCreate.builder()
				.nombre("Deportes")
				.description("Ropa, calzado y accesorios deportivos")
				.build();
		categoriaService.save(c1);

		CategoriaCreate c2 = CategoriaCreate.builder()
				.nombre("Tecnología")
				.description("Dispositivos electrónicos y periféricos")
				.build();
		categoriaService.save(c2);

		CategoriaCreate c3 = CategoriaCreate.builder()
				.nombre("Hogar")
				.description("Muebles, decoración y cocina")
				.build();
		categoriaService.save(c3);

		ProductoCreate p1 = ProductoCreate.builder()
				.nombre("Zapatillas Running")
				.precio(new BigDecimal("89.99"))
				.descripcion("Zapatillas ligeras para asfalto.")
				.stock(50)
				.Imagen("zapatillas_running.png")
				.disponible(true)
				.idCategoria(1L)
				.build();
		productoService.save(p1);

		ProductoCreate p2 = ProductoCreate.builder()
				.nombre("Pelota de Fútbol")
				.precio(new BigDecimal("24.50"))
				.descripcion("Pelota oficial tamaño número 5.")
				.stock(100)
				.Imagen("pelota_futbol.png")
				.disponible(true)
				.idCategoria(1L)
				.build();
		productoService.save(p2);

		ProductoCreate p3 = ProductoCreate.builder()
				.nombre("Gorra Deportiva")
				.precio(new BigDecimal("15.00"))
				.descripcion("Gorra con protección UV y transpirable.")
				.stock(30)
				.Imagen("gorra_deportes.png")
				.disponible(true)
				.idCategoria(1L)
				.build();
		productoService.save(p3);

		// --- Productos: Tecnología (idCategoria: 2L) ---
		ProductoCreate p4 = ProductoCreate.builder()
				.nombre("Teclado Mecánico RGB")
				.precio(new BigDecimal("59.99"))
				.descripcion("Teclado con switches red ideal para gaming.")
				.stock(20)
				.Imagen("teclado_rgb.png")
				.disponible(true)
				.idCategoria(2L)
				.build();
		productoService.save(p4);

		ProductoCreate p5 = ProductoCreate.builder()
				.nombre("Ratón Inalámbrico")
				.precio(new BigDecimal("29.90"))
				.descripcion("Ratón ergonómico con batería recargable.")
				.stock(45)
				.Imagen("mouse_wireless.png")
				.disponible(true)
				.idCategoria(2L)
				.build();
		productoService.save(p5);

		ProductoCreate p6 = ProductoCreate.builder()
				.nombre("Auriculares Bluetooth")
				.precio(new BigDecimal("79.50"))
				.descripcion("Auriculares con cancelación de ruido activa.")
				.stock(15)
				.Imagen("auriculares_canceling.png")
				.disponible(true)
				.idCategoria(2L)
				.build();
		productoService.save(p6);

		ProductoCreate p7 = ProductoCreate.builder()
				.nombre("Monitor 24 Pulgadas")
				.precio(new BigDecimal("149.99"))
				.descripcion("Monitor Full HD IPS con tasa de refresco a 75Hz.")
				.stock(10)
				.Imagen("monitor_24.png")
				.disponible(true)
				.idCategoria(2L)
				.build();
		productoService.save(p7);

		// --- Productos: Hogar (idCategoria: 3L) ---
		ProductoCreate p8 = ProductoCreate.builder()
				.nombre("Lámpara de Escritorio")
				.precio(new BigDecimal("19.99"))
				.descripcion("Lámpara LED con regulación de brillo.")
				.stock(25)
				.Imagen("lampara_led.png")
				.disponible(true)
				.idCategoria(3L)
				.build();
		productoService.save(p8);

		ProductoCreate p9 = ProductoCreate.builder()
				.nombre("Cafetera de Goteo")
				.precio(new BigDecimal("39.99"))
				.descripcion("Cafetera programable con jarra de vidrio.")
				.stock(12)
				.Imagen("cafetera_goteo.png")
				.disponible(true)
				.idCategoria(3L)
				.build();
		productoService.save(p9);

		ProductoCreate p10 = ProductoCreate.builder()
				.nombre("Silla Ergonómica")
				.precio(new BigDecimal("120.00"))
				.descripcion("Silla de oficina con soporte lumbar ajustable.")
				.stock(8)
				.Imagen("silla_oficina.png")
				.disponible(true)
				.idCategoria(3L)
				.build();
		productoService.save(p10);


	productoService.save(p1);

		UsuarioCreate u1= UsuarioCreate.builder()
				.nombre("Nahuel")
				.rol(Rol.ADMIN)
				.mail("nahuel_nahuel@mail.com")
				.contrasena("1234")
				.celular("0179451145")
				.build();
		usuarioService.save(u1);

		UsuarioCreate u2= UsuarioCreate.builder()
				.nombre("Pedro")
				.rol(Rol.USUARIO)
				.mail("pero_pedro@mail.com")
				.contrasena("4321")
				.celular("01548712")
				.build();
		usuarioService.save(u2);


		DetallePedidoCreate d1=DetallePedidoCreate.builder()
				.idPedido(null)
				.idProducto(2L)
				.cantidad(3)
				.build();

		detallePedidoService.save(d1);

		DetallePedidoCreate d2=DetallePedidoCreate.builder()
				.idPedido(1L)
				.idProducto(3L)
				.cantidad(4)
				.build();

		detallePedidoService.save(d2);

		UsuarioEdit u1Update=UsuarioEdit.builder()
				.nombre("NahuelNuevo")
				.idPedido(1L)
				.build();
		usuarioService.update(u1Update,1L);

		PedidoEdit p1Editado= PedidoEdit.builder()
				.estado(Estado.CONFIRMADO)
				.formaPago(FormaPago.TARJETA)
				.cantidad(2)
				.idProducto(3L)
				.idDetallesPedido(1L)
				.build();
		pedidoService.update(p1Editado,1L);

}
}
