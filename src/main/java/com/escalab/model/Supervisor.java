package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "supervisor")
public class Supervisor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSupervisor;

	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name = "nombre_supervidor", nullable = false, length = 70)
	private String nombre_supervisor;

	@Size(min = 3, max = 150, message = "Dirección debe tener minimo 3 caracteres")
	@Column(name = "dir_Supervisor", nullable = true, length = 150)
	private String dir_Supervisor;

	@Size(min = 9, max = 9, message = "Telefono debe tener 9 caracteres")
	@Column(name = "tel_supervisor", nullable = true, length = 9)
	private String tel_supervisor;

	public Integer getIdSupervisor() {
		return idSupervisor;
	}

	public void setIdSupervisor(Integer idSupervisor) {
		this.idSupervisor = idSupervisor;
	}

	public String getNombre_supervisor() {
		return nombre_supervisor;
	}

	public void setNombre_supervisor(String nombre_supervisor) {
		this.nombre_supervisor = nombre_supervisor;
	}

	public String getDir_Supervisor() {
		return dir_Supervisor;
	}

	public void setDir_Supervisor(String dir_Supervisor) {
		this.dir_Supervisor = dir_Supervisor;
	}

	public String getTel_supervisor() {
		return tel_supervisor;
	}

	public void setTel_supervisor(String tel_supervisor) {
		this.tel_supervisor = tel_supervisor;
	}

}
