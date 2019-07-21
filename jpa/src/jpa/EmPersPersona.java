package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the em_pers_persona database table.
 * 
 */
@Entity
@Table(name="em_pers_persona")
@NamedQuery(name="EmPersPersona.findAll", query="SELECT e FROM EmPersPersona e")
public class EmPersPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_persona")
	private int idPersona;

	@Column(name="estado_persona")
	private byte estadoPersona;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_ingreso")
	private Date fechaIngreso;

	@Column(name="identidicacion_persona")
	private String identidicacionPersona;

	@Column(name="nombre_completo_persona")
	private String nombreCompletoPersona;

	@Column(name="primer_apellido_persona")
	private String primerApellidoPersona;

	@Column(name="segundo_apellido_persona")
	private String segundoApellidoPersona;

	@Column(name="sexo_persona")
	private String sexoPersona;

	//bi-directional many-to-one association to EmPersCorreo
	@OneToMany(mappedBy="emPersPersona")
	private List<EmPersCorreo> emPersCorreos;

	//bi-directional many-to-one association to EmPersEmpleado
	@OneToMany(mappedBy="emPersPersona")
	private List<EmPersEmpleado> emPersEmpleados;

	//bi-directional many-to-one association to EmGenEmpresaSede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private EmGenEmpresaSede emGenEmpresaSede;

	//bi-directional many-to-one association to EmPersDireccion
	@ManyToOne
	@JoinColumn(name="id_direccion")
	private EmPersDireccion emPersDireccion;

	//bi-directional many-to-one association to EmPersTipoDocumento
	@ManyToOne
	@JoinColumn(name="id_tipo_documento")
	private EmPersTipoDocumento emPersTipoDocumento;

	//bi-directional many-to-one association to EmPersTipoPersona
	@ManyToOne
	@JoinColumn(name="id_tipo_persona")
	private EmPersTipoPersona emPersTipoPersona;

	//bi-directional many-to-one association to EmPersTelefono
	@OneToMany(mappedBy="emPersPersona")
	private List<EmPersTelefono> emPersTelefonos;

	public EmPersPersona() {
	}

	public int getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public byte getEstadoPersona() {
		return this.estadoPersona;
	}

	public void setEstadoPersona(byte estadoPersona) {
		this.estadoPersona = estadoPersona;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getIdentidicacionPersona() {
		return this.identidicacionPersona;
	}

	public void setIdentidicacionPersona(String identidicacionPersona) {
		this.identidicacionPersona = identidicacionPersona;
	}

	public String getNombreCompletoPersona() {
		return this.nombreCompletoPersona;
	}

	public void setNombreCompletoPersona(String nombreCompletoPersona) {
		this.nombreCompletoPersona = nombreCompletoPersona;
	}

	public String getPrimerApellidoPersona() {
		return this.primerApellidoPersona;
	}

	public void setPrimerApellidoPersona(String primerApellidoPersona) {
		this.primerApellidoPersona = primerApellidoPersona;
	}

	public String getSegundoApellidoPersona() {
		return this.segundoApellidoPersona;
	}

	public void setSegundoApellidoPersona(String segundoApellidoPersona) {
		this.segundoApellidoPersona = segundoApellidoPersona;
	}

	public String getSexoPersona() {
		return this.sexoPersona;
	}

	public void setSexoPersona(String sexoPersona) {
		this.sexoPersona = sexoPersona;
	}

	public List<EmPersCorreo> getEmPersCorreos() {
		return this.emPersCorreos;
	}

	public void setEmPersCorreos(List<EmPersCorreo> emPersCorreos) {
		this.emPersCorreos = emPersCorreos;
	}

	public EmPersCorreo addEmPersCorreo(EmPersCorreo emPersCorreo) {
		getEmPersCorreos().add(emPersCorreo);
		emPersCorreo.setEmPersPersona(this);

		return emPersCorreo;
	}

	public EmPersCorreo removeEmPersCorreo(EmPersCorreo emPersCorreo) {
		getEmPersCorreos().remove(emPersCorreo);
		emPersCorreo.setEmPersPersona(null);

		return emPersCorreo;
	}

	public List<EmPersEmpleado> getEmPersEmpleados() {
		return this.emPersEmpleados;
	}

	public void setEmPersEmpleados(List<EmPersEmpleado> emPersEmpleados) {
		this.emPersEmpleados = emPersEmpleados;
	}

	public EmPersEmpleado addEmPersEmpleado(EmPersEmpleado emPersEmpleado) {
		getEmPersEmpleados().add(emPersEmpleado);
		emPersEmpleado.setEmPersPersona(this);

		return emPersEmpleado;
	}

	public EmPersEmpleado removeEmPersEmpleado(EmPersEmpleado emPersEmpleado) {
		getEmPersEmpleados().remove(emPersEmpleado);
		emPersEmpleado.setEmPersPersona(null);

		return emPersEmpleado;
	}

	public EmGenEmpresaSede getEmGenEmpresaSede() {
		return this.emGenEmpresaSede;
	}

	public void setEmGenEmpresaSede(EmGenEmpresaSede emGenEmpresaSede) {
		this.emGenEmpresaSede = emGenEmpresaSede;
	}

	public EmPersDireccion getEmPersDireccion() {
		return this.emPersDireccion;
	}

	public void setEmPersDireccion(EmPersDireccion emPersDireccion) {
		this.emPersDireccion = emPersDireccion;
	}

	public EmPersTipoDocumento getEmPersTipoDocumento() {
		return this.emPersTipoDocumento;
	}

	public void setEmPersTipoDocumento(EmPersTipoDocumento emPersTipoDocumento) {
		this.emPersTipoDocumento = emPersTipoDocumento;
	}

	public EmPersTipoPersona getEmPersTipoPersona() {
		return this.emPersTipoPersona;
	}

	public void setEmPersTipoPersona(EmPersTipoPersona emPersTipoPersona) {
		this.emPersTipoPersona = emPersTipoPersona;
	}

	public List<EmPersTelefono> getEmPersTelefonos() {
		return this.emPersTelefonos;
	}

	public void setEmPersTelefonos(List<EmPersTelefono> emPersTelefonos) {
		this.emPersTelefonos = emPersTelefonos;
	}

	public EmPersTelefono addEmPersTelefono(EmPersTelefono emPersTelefono) {
		getEmPersTelefonos().add(emPersTelefono);
		emPersTelefono.setEmPersPersona(this);

		return emPersTelefono;
	}

	public EmPersTelefono removeEmPersTelefono(EmPersTelefono emPersTelefono) {
		getEmPersTelefonos().remove(emPersTelefono);
		emPersTelefono.setEmPersPersona(null);

		return emPersTelefono;
	}

}