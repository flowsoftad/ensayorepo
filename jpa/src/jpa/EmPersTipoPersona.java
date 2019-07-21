package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the em_pers_tipo_persona database table.
 * 
 */
@Entity
@Table(name="em_pers_tipo_persona")
@NamedQuery(name="EmPersTipoPersona.findAll", query="SELECT e FROM EmPersTipoPersona e")
public class EmPersTipoPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_persona")
	private int idTipoPersona;

	@Column(name="descripcion_tipo_persona")
	private String descripcionTipoPersona;

	@Column(name="descripcion_tipo_persona")
	private String descripcionTipoPersona;

	@Column(name="estado_tipo_persona")
	private byte estadoTipoPersona;

	@Column(name="estado_tipo_persona")
	private byte estadoTipoPersona;

	//bi-directional many-to-one association to EmPersPersona
	@OneToMany(mappedBy="emPersTipoPersona")
	private List<EmPersPersona> emPersPersonas;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	public EmPersTipoPersona() {
	}

	public int getIdTipoPersona() {
		return this.idTipoPersona;
	}

	public void setIdTipoPersona(int idTipoPersona) {
		this.idTipoPersona = idTipoPersona;
	}

	public String getDescripcionTipoPersona() {
		return this.descripcionTipoPersona;
	}

	public void setDescripcionTipoPersona(String descripcionTipoPersona) {
		this.descripcionTipoPersona = descripcionTipoPersona;
	}

	public String getDescripcionTipoPersona() {
		return this.descripcionTipoPersona;
	}

	public void setDescripcionTipoPersona(String descripcionTipoPersona) {
		this.descripcionTipoPersona = descripcionTipoPersona;
	}

	public byte getEstadoTipoPersona() {
		return this.estadoTipoPersona;
	}

	public void setEstadoTipoPersona(byte estadoTipoPersona) {
		this.estadoTipoPersona = estadoTipoPersona;
	}

	public byte getEstadoTipoPersona() {
		return this.estadoTipoPersona;
	}

	public void setEstadoTipoPersona(byte estadoTipoPersona) {
		this.estadoTipoPersona = estadoTipoPersona;
	}

	public List<EmPersPersona> getEmPersPersonas() {
		return this.emPersPersonas;
	}

	public void setEmPersPersonas(List<EmPersPersona> emPersPersonas) {
		this.emPersPersonas = emPersPersonas;
	}

	public EmPersPersona addEmPersPersona(EmPersPersona emPersPersona) {
		getEmPersPersonas().add(emPersPersona);
		emPersPersona.setEmPersTipoPersona(this);

		return emPersPersona;
	}

	public EmPersPersona removeEmPersPersona(EmPersPersona emPersPersona) {
		getEmPersPersonas().remove(emPersPersona);
		emPersPersona.setEmPersTipoPersona(null);

		return emPersPersona;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

}