package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_pers_role database table.
 * 
 */
@Entity
@Table(name="em_pers_role")
@NamedQuery(name="EmPersRole.findAll", query="SELECT e FROM EmPersRole e")
public class EmPersRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_role")
	private int idRole;

	@Column(name="descripcion_role")
	private String descripcionRole;

	@Column(name="estado_role")
	private byte estadoRole;

	//bi-directional many-to-one association to EmPersEmpleado
	@OneToMany(mappedBy="emPersRole")
	private List<EmPersEmpleado> emPersEmpleados;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	public EmPersRole() {
	}

	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getDescripcionRole() {
		return this.descripcionRole;
	}

	public void setDescripcionRole(String descripcionRole) {
		this.descripcionRole = descripcionRole;
	}

	public byte getEstadoRole() {
		return this.estadoRole;
	}

	public void setEstadoRole(byte estadoRole) {
		this.estadoRole = estadoRole;
	}

	public List<EmPersEmpleado> getEmPersEmpleados() {
		return this.emPersEmpleados;
	}

	public void setEmPersEmpleados(List<EmPersEmpleado> emPersEmpleados) {
		this.emPersEmpleados = emPersEmpleados;
	}

	public EmPersEmpleado addEmPersEmpleado(EmPersEmpleado emPersEmpleado) {
		getEmPersEmpleados().add(emPersEmpleado);
		emPersEmpleado.setEmPersRole(this);

		return emPersEmpleado;
	}

	public EmPersEmpleado removeEmPersEmpleado(EmPersEmpleado emPersEmpleado) {
		getEmPersEmpleados().remove(emPersEmpleado);
		emPersEmpleado.setEmPersRole(null);

		return emPersEmpleado;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

}