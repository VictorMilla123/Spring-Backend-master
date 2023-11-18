package pe.com.ventas.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "producto")
public class Producto {

	@Id
	private Long id_producto;

	private String nombre;

	private Double precio;
	
	private Integer stock;

	private Integer estado;
	
}
