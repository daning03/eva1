package modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "medicamento")
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idMedicamento;
	private int stock;
	private String nombre;
	private String descripcion;
	private String categoria;	
	private String proveedor;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechavencimiento;
	private String precio;
	

	public Medicamento(int idMedicamento, int stock, String nombre, String descripcion, String categoria,
			String proveedor, Date fechavencimiento, String precio) {
		super();
		this.idMedicamento = idMedicamento;
		this.stock = stock;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.proveedor = proveedor;
		this.fechavencimiento = fechavencimiento;
		this.precio = precio;
	}
	public Medicamento() {
		super();
	}
	public int getIdMedicamento() {
		return idMedicamento;
	}
	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public Date getFechavencimiento() {
		return fechavencimiento;
	}
	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Medicamento [idMedicamento=" + idMedicamento + ", stock=" + stock + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", categoria=" + categoria + ", proveedor=" + proveedor
				+ ", fechavencimiento=" + fechavencimiento + ", precio=" + precio + "]";
	}	
}
