package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the em_pers_empleado database table.
 * 
 */
@Entity
@Table(name="em_pers_empleado")
@NamedQuery(name="EmPersEmpleado.findAll", query="SELECT e FROM EmPersEmpleado e")
public class EmPersEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_empleado")
	private int idEmpleado;

	@Column(name="arl_empleado")
	private String arlEmpleado;

	@Column(name="eps_empleado")
	private String epsEmpleado;

	@Column(name="estado_empleado")
	private byte estadoEmpleado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_ingreso_empleado")
	private Date fechaIngresoEmpleado;

	@Column(name="salario_empleado")
	private float salarioEmpleado;

	//bi-directional many-to-one association to EmPersContrasena
	@OneToMany(mappedBy="emPersEmpleado")
	private List<EmPersContrasena> emPersContrasenas;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmPersPersona
	@ManyToOne
	@JoinColumn(name="id_persona")
	private EmPersPersona emPersPersona;

	//bi-directional many-to-one association to EmPersRole
	@ManyToOne
	@JoinColumn(name="id_role")
	private EmPersRole emPersRole;

	public EmPersEmpleado() {
	}

	public int getIdEmpleado() {
		return this.idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getArlEmpleado() {
		return this.arlEmpleado;
	}

	public void setArlEmpleado(String arlEmpleado) {
		this.arlEmpleado = arlEmpleado;
	}

	public String getEpsEmpleado() {
		return this.epsEmpleado;
	}

	public void setEpsEmpleado(String epsEmpleado) {
		this.epsEmpleado = epsEmpleado;
	}

	public byte getEstadoEmpleado() {
		return this.estadoEmpleado;
	}

	public void setEstadoEmpleado(byte estadoEmpleado) {
		this.estadoEmpleado = estadoEmpleado;
	}

	public Date getFechaIngresoEmpleado() {
		return this.fechaIngresoEmpleado;
	}

	public void setFechaIngresoEmpleado(Date fechaIngresoEmpleado) {
		this.fechaIngresoEmpleado = fechaIngresoEmpleado;
	}

	public float getSalarioEmpleado() {
		return this.salarioEmpleado;
	}

	public void setSalarioEmpleado(float salarioEmpleado) {
		this.salarioEmpleado = salarioEmpleado;
	}

	public List<EmPersContrasena> getEmPersContrasenas() {
		return this.emPersContrasenas;
	}

	public void setEmPersContrasenas(List<EmPersContrasena> emPersContrasenas) {
		this.emPersContrasenas = emPersContrasenas;
	}

	public EmPersContrasena addEmPersContrasena(EmPersContrasena emPersContrasena) {
		getEmPersContrasenas().add(emPersContrasena);
		emPersContrasena.setEmPersEmpleado(this);

		return emPersContrasena;
	}

	public EmPersContrasena removeEmPersContrasena(EmPersContrasena emPersContrasena) {
		getEmPersContrasenas().remove(emPersContrasena);
		emPersContrasena.setEmPersEmpleado(null);

		return emPersContrasena;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public EmPersPersona getEmPersPersona() {
		return this.emPersPersona;
	}

	public void setEmPersPersona(EmPersPersona emPersPersona) {
		this.emPersPersona = emPersPersona;
	}

	public EmPersRole getEmPersRole() {
		return this.emPersRole;
	}

	public void setEmPersRole(EmPersRole emPersRole) {
		this.emPersRole = emPersRole;
	}

}