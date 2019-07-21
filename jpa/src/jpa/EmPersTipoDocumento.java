package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_pers_tipo_documento database table.
 * 
 */
@Entity
@Table(name="em_pers_tipo_documento")
@NamedQuery(name="EmPersTipoDocumento.findAll", query="SELECT e FROM EmPersTipoDocumento e")
public class EmPersTipoDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_documento")
	private int idTipoDocumento;

	@Column(name="descripcion_documento")
	private String descripcionDocumento;

	@Column(name="estado_tipo_documento")
	private byte estadoTipoDocumento;

	//bi-directional many-to-one association to EmPersPersona
	@OneToMany(mappedBy="emPersTipoDocumento")
	private List<EmPersPersona> emPersPersonas;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	public EmPersTipoDocumento() {
	}

	public int getIdTipoDocumento() {
		return this.idTipoDocumento;
	}

	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getDescripcionDocumento() {
		return this.descripcionDocumento;
	}

	public void setDescripcionDocumento(String descripcionDocumento) {
		this.descripcionDocumento = descripcionDocumento;
	}

	public byte getEstadoTipoDocumento() {
		return this.estadoTipoDocumento;
	}

	public void setEstadoTipoDocumento(byte estadoTipoDocumento) {
		this.estadoTipoDocumento = estadoTipoDocumento;
	}

	public List<EmPersPersona> getEmPersPersonas() {
		return this.emPersPersonas;
	}

	public void setEmPersPersonas(List<EmPersPersona> emPersPersonas) {
		this.emPersPersonas = emPersPersonas;
	}

	public EmPersPersona addEmPersPersona(EmPersPersona emPersPersona) {
		getEmPersPersonas().add(emPersPersona);
		emPersPersona.setEmPersTipoDocumento(this);

		return emPersPersona;
	}

	public EmPersPersona removeEmPersPersona(EmPersPersona emPersPersona) {
		getEmPersPersonas().remove(emPersPersona);
		emPersPersona.setEmPersTipoDocumento(null);

		return emPersPersona;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

}