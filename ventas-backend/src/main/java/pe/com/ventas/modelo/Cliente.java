package pe.com.ventas.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "cliente")
public class Cliente {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;

//	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

//	@Column(name = "apellido", length = 60, nullable = false)
	private String apellido;

//	@Column(name = "direccion", length = 60, nullable = false, unique = true)
	private String direccion;
	
//	@Column(name = "fecha_nacimiento", length = 60, nullable = false, unique = true)
	private Date fecha_nacimiento;
	
//	@Column(name = "telefono", length = 60, nullable = false, unique = true)
	private String telefono;
	
//	@Column(name = "email", length = 60, nullable = false, unique = true)
	private String email;

//	public Cliente() {
//
//	}
//
//	public Cliente(Long id_cliente, String nombre, String apellido, String direccion, Date fecha_nacimiento,
//			String telefono, String email) {
//		super();
//		this.id_cliente = id_cliente;
//		this.nombre = nombre;
//		this.apellido = apellido;
//		this.direccion = direccion;
//		this.fecha_nacimiento = fecha_nacimiento;
//		this.telefono = telefono;
//		this.email = email;
//	}
//
//	public Long getId_cliente() {
//		return id_cliente;
//	}
//
//	public void setId_cliente(Long id_cliente) {
//		this.id_cliente = id_cliente;
//	}
//
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public String getApellido() {
//		return apellido;
//	}
//
//	public void setApellido(String apellido) {
//		this.apellido = apellido;
//	}
//
//	public String getDireccion() {
//		return direccion;
//	}
//
//	public void setDireccion(String direccion) {
//		this.direccion = direccion;
//	}
//
//	public Date getFecha_nacimiento() {
//		return fecha_nacimiento;
//	}
//
//	public void setFecha_nacimiento(Date fecha_nacimiento) {
//		this.fecha_nacimiento = fecha_nacimiento;
//	}
//
//	public String getTelefono() {
//		return telefono;
//	}
//
//	public void setTelefono(String telefono) {
//		this.telefono = telefono;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

	

	
}
