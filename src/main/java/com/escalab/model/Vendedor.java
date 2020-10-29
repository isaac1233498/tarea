package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vendedor")
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVendedor;
	
	@ManyToOne
	@JoinColumn( name = "id_supervisor", nullable = false , foreignKey = @ForeignKey(name = "FK_verdedor_supervisor"))
	private Supervisor supervidor;
	
	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name = "nombre_vendedor", nullable = false, length = 70)
	private String nombre_vendedor;
	
	@Size(min = 3, max = 150, message = "Dirección debe tener minimo 3 caracteres")
	@Column(name = "dir_vendedor", nullable = true, length = 150)
	private String dir_vendedor;

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Supervisor getSupervidor() {
		return supervidor;
	}

	public void setSupervidor(Supervisor supervidor) {
		this.supervidor = supervidor;
	}

	public String getNombre_vendedor() {
		return nombre_vendedor;
	}

	public void setNombre_vendedor(String nombre_vendedor) {
		this.nombre_vendedor = nombre_vendedor;
	}

	public String getDir_vendedor() {
		return dir_vendedor;
	}

	public void setDir_vendedor(String dir_vendedor) {
		this.dir_vendedor = dir_vendedor;
	}
}
