package jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the em_pers_contrasena database table.
 * 
 */
@Entity
@Table(name="em_pers_contrasena")
@NamedQuery(name="EmPersContrasena.findAll", query="SELECT e FROM EmPersContrasena e")
public class EmPersContrasena implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_contrasena")
	private int idContrasena;

	private String contrasena;

	@Column(name="estado_contrasena")
	private byte estadoContrasena;

	private String usuario;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmPersEmpleado
	@ManyToOne
	@JoinColumn(name="id_empleado")
	private EmPersEmpleado emPersEmpleado;

	public EmPersContrasena() {
	}

	public int getIdContrasena() {
		return this.idContrasena;
	}

	public void setIdContrasena(int idContrasena) {
		this.idContrasena = idContrasena;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public byte getEstadoContrasena() {
		return this.estadoContrasena;
	}

	public void setEstadoContrasena(byte estadoContrasena) {
		this.estadoContrasena = estadoContrasena;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public EmPersEmpleado getEmPersEmpleado() {
		return this.emPersEmpleado;
	}

	public void setEmPersEmpleado(EmPersEmpleado emPersEmpleado) {
		this.emPersEmpleado = emPersEmpleado;
	}

}