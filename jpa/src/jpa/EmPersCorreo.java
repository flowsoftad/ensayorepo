package jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the em_pers_correo database table.
 * 
 */
@Entity
@Table(name="em_pers_correo")
@NamedQuery(name="EmPersCorreo.findAll", query="SELECT e FROM EmPersCorreo e")
public class EmPersCorreo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_correo")
	private int idCorreo;

	@Column(name="correo_persona")
	private String correoPersona;

	@Column(name="estado_correo")
	private byte estadoCorreo;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmPersPersona
	@ManyToOne
	@JoinColumn(name="id_persona")
	private EmPersPersona emPersPersona;

	public EmPersCorreo() {
	}

	public int getIdCorreo() {
		return this.idCorreo;
	}

	public void setIdCorreo(int idCorreo) {
		this.idCorreo = idCorreo;
	}

	public String getCorreoPersona() {
		return this.correoPersona;
	}

	public void setCorreoPersona(String correoPersona) {
		this.correoPersona = correoPersona;
	}

	public byte getEstadoCorreo() {
		return this.estadoCorreo;
	}

	public void setEstadoCorreo(byte estadoCorreo) {
		this.estadoCorreo = estadoCorreo;
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

}