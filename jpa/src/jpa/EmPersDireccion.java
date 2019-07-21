package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_pers_direccion database table.
 * 
 */
@Entity
@Table(name="em_pers_direccion")
@NamedQuery(name="EmPersDireccion.findAll", query="SELECT e FROM EmPersDireccion e")
public class EmPersDireccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_direccion")
	private int idDireccion;

	@Column(name="descripcion_direccion")
	private String descripcionDireccion;

	@Column(name="estado_direccion")
	private short estadoDireccion;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmPersPersona
	@OneToMany(mappedBy="emPersDireccion")
	private List<EmPersPersona> emPersPersonas;

	public EmPersDireccion() {
	}

	public int getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getDescripcionDireccion() {
		return this.descripcionDireccion;
	}

	public void setDescripcionDireccion(String descripcionDireccion) {
		this.descripcionDireccion = descripcionDireccion;
	}

	public short getEstadoDireccion() {
		return this.estadoDireccion;
	}

	public void setEstadoDireccion(short estadoDireccion) {
		this.estadoDireccion = estadoDireccion;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public List<EmPersPersona> getEmPersPersonas() {
		return this.emPersPersonas;
	}

	public void setEmPersPersonas(List<EmPersPersona> emPersPersonas) {
		this.emPersPersonas = emPersPersonas;
	}

	public EmPersPersona addEmPersPersona(EmPersPersona emPersPersona) {
		getEmPersPersonas().add(emPersPersona);
		emPersPersona.setEmPersDireccion(this);

		return emPersPersona;
	}

	public EmPersPersona removeEmPersPersona(EmPersPersona emPersPersona) {
		getEmPersPersonas().remove(emPersPersona);
		emPersPersona.setEmPersDireccion(null);

		return emPersPersona;
	}

}