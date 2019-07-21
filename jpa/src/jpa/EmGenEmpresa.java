package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_gen_empresa database table.
 * 
 */
@Entity
@Table(name="em_gen_empresa")
@NamedQuery(name="EmGenEmpresa.findAll", query="SELECT e FROM EmGenEmpresa e")
public class EmGenEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_empresa")
	private int idEmpresa;

	@Column(name="contacto_empresa")
	private String contactoEmpresa;

	@Column(name="email_empresa")
	private String emailEmpresa;

	@Column(name="estado_empresa")
	private byte estadoEmpresa;

	@Column(name="nit_empresa")
	private String nitEmpresa;

	@Column(name="nombre_empresa")
	private String nombreEmpresa;

	@Column(name="pagina_web_empresa")
	private String paginaWebEmpresa;

	@Column(name="telefono_empresa")
	private String telefonoEmpresa;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@OneToMany(mappedBy="emGenEmpresa")
	private List<EmGenEmpresaSede> emGenEmpresaSedes;

	public EmGenEmpresa() {
	}

	public int getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getContactoEmpresa() {
		return this.contactoEmpresa;
	}

	public void setContactoEmpresa(String contactoEmpresa) {
		this.contactoEmpresa = contactoEmpresa;
	}

	public String getEmailEmpresa() {
		return this.emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public byte getEstadoEmpresa() {
		return this.estadoEmpresa;
	}

	public void setEstadoEmpresa(byte estadoEmpresa) {
		this.estadoEmpresa = estadoEmpresa;
	}

	public String getNitEmpresa() {
		return this.nitEmpresa;
	}

	public void setNitEmpresa(String nitEmpresa) {
		this.nitEmpresa = nitEmpresa;
	}

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getPaginaWebEmpresa() {
		return this.paginaWebEmpresa;
	}

	public void setPaginaWebEmpresa(String paginaWebEmpresa) {
		this.paginaWebEmpresa = paginaWebEmpresa;
	}

	public String getTelefonoEmpresa() {
		return this.telefonoEmpresa;
	}

	public void setTelefonoEmpresa(String telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}

	public List<EmGenEmpresaSede> getEmGenEmpresaSedes() {
		return this.emGenEmpresaSedes;
	}

	public void setEmGenEmpresaSedes(List<EmGenEmpresaSede> emGenEmpresaSedes) {
		this.emGenEmpresaSedes = emGenEmpresaSedes;
	}

	public EmGenEmpresaSede addEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		getEmGenEmpresaSedes().add(emGenEmpresaSede);
		emGenEmpresaSede.setEmGenEmpresa(this);

		return emGenEmpresaSede;
	}

	public EmGenEmpresaSede removeEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		getEmGenEmpresaSedes().remove(emGenEmpresaSede);
		emGenEmpresaSede.setEmGenEmpresa(null);

		return emGenEmpresaSede;
	}

}