package jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the em_pers_telefono database table.
 * 
 */
@Entity
@Table(name="em_pers_telefono")
@NamedQuery(name="EmPersTelefono.findAll", query="SELECT e FROM EmPersTelefono e")
public class EmPersTelefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_telefono")
	private int idTelefono;

	@Column(name="estado_telefono")
	private byte estadoTelefono;

	@Column(name="numero_telefono")
	private String numeroTelefono;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmPersPersona
	@ManyToOne
	@JoinColumn(name="id_persona")
	private EmPersPersona emPersPersona;

	//bi-directional many-to-one association to EmPersTipoTelefono
	@ManyToOne
	@JoinColumn(name="id_tipo_telefono")
	private EmPersTipoTelefono emPersTipoTelefono;

	public EmPersTelefono() {
	}

	public int getIdTelefono() {
		return this.idTelefono;
	}

	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}

	public byte getEstadoTelefono() {
		return this.estadoTelefono;
	}

	public void setEstadoTelefono(byte estadoTelefono) {
		this.estadoTelefono = estadoTelefono;
	}

	public String getNumeroTelefono() {
		return this.numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
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

	public EmPersTipoTelefono getEmPersTipoTelefono() {
		return this.emPersTipoTelefono;
	}

	public void setEmPersTipoTelefono(EmPersTipoTelefono emPersTipoTelefono) {
		this.emPersTipoTelefono = emPersTipoTelefono;
	}

}