package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_pers_tipo_telefono database table.
 * 
 */
@Entity
@Table(name="em_pers_tipo_telefono")
@NamedQuery(name="EmPersTipoTelefono.findAll", query="SELECT e FROM EmPersTipoTelefono e")
public class EmPersTipoTelefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_telefono")
	private int idTipoTelefono;

	@Column(name="descripcion_tipo_telefono")
	private String descripcionTipoTelefono;

	@Column(name="estado_tipo_telefono")
	private byte estadoTipoTelefono;

	//bi-directional many-to-one association to EmPersTelefono
	@OneToMany(mappedBy="emPersTipoTelefono")
	private List<EmPersTelefono> emPersTelefonos;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	public EmPersTipoTelefono() {
	}

	public int getIdTipoTelefono() {
		return this.idTipoTelefono;
	}

	public void setIdTipoTelefono(int idTipoTelefono) {
		this.idTipoTelefono = idTipoTelefono;
	}

	public String getDescripcionTipoTelefono() {
		return this.descripcionTipoTelefono;
	}

	public void setDescripcionTipoTelefono(String descripcionTipoTelefono) {
		this.descripcionTipoTelefono = descripcionTipoTelefono;
	}

	public byte getEstadoTipoTelefono() {
		return this.estadoTipoTelefono;
	}

	public void setEstadoTipoTelefono(byte estadoTipoTelefono) {
		this.estadoTipoTelefono = estadoTipoTelefono;
	}

	public List<EmPersTelefono> getEmPersTelefonos() {
		return this.emPersTelefonos;
	}

	public void setEmPersTelefonos(List<EmPersTelefono> emPersTelefonos) {
		this.emPersTelefonos = emPersTelefonos;
	}

	public EmPersTelefono addEmPersTelefono(EmPersTelefono emPersTelefono) {
		getEmPersTelefonos().add(emPersTelefono);
		emPersTelefono.setEmPersTipoTelefono(this);

		return emPersTelefono;
	}

	public EmPersTelefono removeEmPersTelefono(EmPersTelefono emPersTelefono) {
		getEmPersTelefonos().remove(emPersTelefono);
		emPersTelefono.setEmPersTipoTelefono(null);

		return emPersTelefono;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

}