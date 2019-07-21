package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the em_gen_empresa_sede database table.
 * 
 */
@Entity
@Table(name="em_gen_empresa_sede")
@NamedQuery(name="EmGenEmpresaSede.findAll", query="SELECT e FROM EmGenEmpresaSede e")
public class EmGenEmpresaSede implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_sede")
	private int idSede;

	@Column(name="ciudad_sede")
	private String ciudadSede;

	@Column(name="contacto_sede")
	private String contactoSede;

	@Column(name="direccion_sede")
	private String direccionSede;

	@Column(name="email_sede")
	private String emailSede;

	@Column(name="estado_sede")
	private byte estadoSede;

	@Column(name="nombre_sede")
	private String nombreSede;

	@Column(name="telefono_sede")
	private String telefonoSede;

	//bi-directional many-to-one association to EmGenCompra
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenCompra> emGenCompras;

	//bi-directional many-to-one association to EmGenCompraDetalle
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenCompraDetalle> emGenCompraDetalles;

	//bi-directional many-to-one association to EmGenEmpresa
	@ManyToOne
	@JoinColumn(name="id_empresa")
	private EmGenEmpresa emGenEmpresa;

	//bi-directional many-to-one association to EmGenFormula
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenFormula> emGenFormulas;

	//bi-directional many-to-one association to EmGenIngrediente
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenIngrediente> emGenIngredientes;

	//bi-directional many-to-one association to EmGenInventarioMateriaPrima
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenInventarioMateriaPrima> emGenInventarioMateriaPrimas;

	//bi-directional many-to-one association to EmGenMoje
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenMoje> emGenMojes;

	//bi-directional many-to-one association to EmGenProducto
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenProducto> emGenProductos;

	//bi-directional many-to-one association to EmGenProductoFinal
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenProductoFinal> emGenProductoFinals;

	//bi-directional many-to-one association to EmGenProveedor
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenProveedor> emGenProveedors;

	//bi-directional many-to-one association to EmGenProveedorTelefono
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenProveedorTelefono> emGenProveedorTelefonos;

	//bi-directional many-to-one association to EmGenUnidadMedida
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmGenUnidadMedida> emGenUnidadMedidas;

	//bi-directional many-to-one association to EmPersContrasena
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmPersContrasena> emPersContrasenas;

	//bi-directional many-to-one association to EmPersCorreo
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmPersCorreo> emPersCorreos;

	//bi-directional many-to-one association to EmPersDireccion
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmPersDireccion> emPersDireccions;

	//bi-directional many-to-one association to EmPersEmpleado
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmPersEmpleado> emPersEmpleados;

	//bi-directional many-to-one association to EmPersPersona
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmPersPersona> emPersPersonas;

	//bi-directional many-to-one association to EmPersRole
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmPersRole> emPersRoles;

	//bi-directional many-to-one association to EmPersTelefono
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmPersTelefono> emPersTelefonos;

	//bi-directional many-to-one association to EmPersTipoDocumento
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmPersTipoDocumento> emPersTipoDocumentos;

	//bi-directional many-to-one association to EmPersTipoPersona
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmPersTipoPersona> emPersTipoPersonas;

	//bi-directional many-to-one association to EmPersTipoTelefono
	@OneToMany(mappedBy="emGenEmpresaSede")
	private List<EmPersTipoTelefono> emPersTipoTelefonos;

	public EmGenEmpresaSede() {
	}

	public int getIdSede() {
		return this.idSede;
	}

	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}

	public String getCiudadSede() {
		return this.ciudadSede;
	}

	public void setCiudadSede(String ciudadSede) {
		this.ciudadSede = ciudadSede;
	}

	public String getContactoSede() {
		return this.contactoSede;
	}

	public void setContactoSede(String contactoSede) {
		this.contactoSede = contactoSede;
	}

	public String getDireccionSede() {
		return this.direccionSede;
	}

	public void setDireccionSede(String direccionSede) {
		this.direccionSede = direccionSede;
	}

	public String getEmailSede() {
		return this.emailSede;
	}

	public void setEmailSede(String emailSede) {
		this.emailSede = emailSede;
	}

	public byte getEstadoSede() {
		return this.estadoSede;
	}

	public void setEstadoSede(byte estadoSede) {
		this.estadoSede = estadoSede;
	}

	public String getNombreSede() {
		return this.nombreSede;
	}

	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}

	public String getTelefonoSede() {
		return this.telefonoSede;
	}

	public void setTelefonoSede(String telefonoSede) {
		this.telefonoSede = telefonoSede;
	}

	public List<EmGenCompra> getEmGenCompras() {
		return this.emGenCompras;
	}

	public void setEmGenCompras(List<EmGenCompra> emGenCompras) {
		this.emGenCompras = emGenCompras;
	}

	public EmGenCompra addEmGenCompra(EmGenCompra emGenCompra) {
		getEmGenCompras().add(emGenCompra);
		emGenCompra.setEmGenEmpresaSede(this);

		return emGenCompra;
	}

	public EmGenCompra removeEmGenCompra(EmGenCompra emGenCompra) {
		getEmGenCompras().remove(emGenCompra);
		emGenCompra.setEmGenEmpresaSede(null);

		return emGenCompra;
	}

	public List<EmGenCompraDetalle> getEmGenCompraDetalles() {
		return this.emGenCompraDetalles;
	}

	public void setEmGenCompraDetalles(List<EmGenCompraDetalle> emGenCompraDetalles) {
		this.emGenCompraDetalles = emGenCompraDetalles;
	}

	public EmGenCompraDetalle addEmGenCompraDetalle(EmGenCompraDetalle emGenCompraDetalle) {
		getEmGenCompraDetalles().add(emGenCompraDetalle);
		emGenCompraDetalle.setEmGenEmpresaSede(this);

		return emGenCompraDetalle;
	}

	public EmGenCompraDetalle removeEmGenCompraDetalle(EmGenCompraDetalle emGenCompraDetalle) {
		getEmGenCompraDetalles().remove(emGenCompraDetalle);
		emGenCompraDetalle.setEmGenEmpresaSede(null);

		return emGenCompraDetalle;
	}

	public EmGenEmpresa getEmGenEmpresa() {
		return this.emGenEmpresa;
	}

	public void setEmGenEmpresa(EmGenEmpresa emGenEmpresa) {
		this.emGenEmpresa = emGenEmpresa;
	}

	public List<EmGenFormula> getEmGenFormulas() {
		return this.emGenFormulas;
	}

	public void setEmGenFormulas(List<EmGenFormula> emGenFormulas) {
		this.emGenFormulas = emGenFormulas;
	}

	public EmGenFormula addEmGenFormula(EmGenFormula emGenFormula) {
		getEmGenFormulas().add(emGenFormula);
		emGenFormula.setEmGenEmpresaSede(this);

		return emGenFormula;
	}

	public EmGenFormula removeEmGenFormula(EmGenFormula emGenFormula) {
		getEmGenFormulas().remove(emGenFormula);
		emGenFormula.setEmGenEmpresaSede(null);

		return emGenFormula;
	}

	public List<EmGenIngrediente> getEmGenIngredientes() {
		return this.emGenIngredientes;
	}

	public void setEmGenIngredientes(List<EmGenIngrediente> emGenIngredientes) {
		this.emGenIngredientes = emGenIngredientes;
	}

	public EmGenIngrediente addEmGenIngrediente(EmGenIngrediente emGenIngrediente) {
		getEmGenIngredientes().add(emGenIngrediente);
		emGenIngrediente.setEmGenEmpresaSede(this);

		return emGenIngrediente;
	}

	public EmGenIngrediente removeEmGenIngrediente(EmGenIngrediente emGenIngrediente) {
		getEmGenIngredientes().remove(emGenIngrediente);
		emGenIngrediente.setEmGenEmpresaSede(null);

		return emGenIngrediente;
	}

	public List<EmGenInventarioMateriaPrima> getEmGenInventarioMateriaPrimas() {
		return this.emGenInventarioMateriaPrimas;
	}

	public void setEmGenInventarioMateriaPrimas(List<EmGenInventarioMateriaPrima> emGenInventarioMateriaPrimas) {
		this.emGenInventarioMateriaPrimas = emGenInventarioMateriaPrimas;
	}

	public EmGenInventarioMateriaPrima addEmGenInventarioMateriaPrima(EmGenInventarioMateriaPrima emGenInventarioMateriaPrima) {
		getEmGenInventarioMateriaPrimas().add(emGenInventarioMateriaPrima);
		emGenInventarioMateriaPrima.setEmGenEmpresaSede(this);

		return emGenInventarioMateriaPrima;
	}

	public EmGenInventarioMateriaPrima removeEmGenInventarioMateriaPrima(EmGenInventarioMateriaPrima emGenInventarioMateriaPrima) {
		getEmGenInventarioMateriaPrimas().remove(emGenInventarioMateriaPrima);
		emGenInventarioMateriaPrima.setEmGenEmpresaSede(null);

		return emGenInventarioMateriaPrima;
	}

	public List<EmGenMoje> getEmGenMojes() {
		return this.emGenMojes;
	}

	public void setEmGenMojes(List<EmGenMoje> emGenMojes) {
		this.emGenMojes = emGenMojes;
	}

	public EmGenMoje addEmGenMoje(EmGenMoje emGenMoje) {
		getEmGenMojes().add(emGenMoje);
		emGenMoje.setEmGenEmpresaSede(this);

		return emGenMoje;
	}

	public EmGenMoje removeEmGenMoje(EmGenMoje emGenMoje) {
		getEmGenMojes().remove(emGenMoje);
		emGenMoje.setEmGenEmpresaSede(null);

		return emGenMoje;
	}

	public List<EmGenProducto> getEmGenProductos() {
		return this.emGenProductos;
	}

	public void setEmGenProductos(List<EmGenProducto> emGenProductos) {
		this.emGenProductos = emGenProductos;
	}

	public EmGenProducto addEmGenProducto(EmGenProducto emGenProducto) {
		getEmGenProductos().add(emGenProducto);
		emGenProducto.setEmGenEmpresaSede(this);

		return emGenProducto;
	}

	public EmGenProducto removeEmGenProducto(EmGenProducto emGenProducto) {
		getEmGenProductos().remove(emGenProducto);
		emGenProducto.setEmGenEmpresaSede(null);

		return emGenProducto;
	}

	public List<EmGenProductoFinal> getEmGenProductoFinals() {
		return this.emGenProductoFinals;
	}

	public void setEmGenProductoFinals(List<EmGenProductoFinal> emGenProductoFinals) {
		this.emGenProductoFinals = emGenProductoFinals;
	}

	public EmGenProductoFinal addEmGenProductoFinal(EmGenProductoFinal emGenProductoFinal) {
		getEmGenProductoFinals().add(emGenProductoFinal);
		emGenProductoFinal.setEmGenEmpresaSede(this);

		return emGenProductoFinal;
	}

	public EmGenProductoFinal removeEmGenProductoFinal(EmGenProductoFinal emGenProductoFinal) {
		getEmGenProductoFinals().remove(emGenProductoFinal);
		emGenProductoFinal.setEmGenEmpresaSede(null);

		return emGenProductoFinal;
	}

	public List<EmGenProveedor> getEmGenProveedors() {
		return this.emGenProveedors;
	}

	public void setEmGenProveedors(List<EmGenProveedor> emGenProveedors) {
		this.emGenProveedors = emGenProveedors;
	}

	public EmGenProveedor addEmGenProveedor(EmGenProveedor emGenProveedor) {
		getEmGenProveedors().add(emGenProveedor);
		emGenProveedor.setEmGenEmpresaSede(this);

		return emGenProveedor;
	}

	public EmGenProveedor removeEmGenProveedor(EmGenProveedor emGenProveedor) {
		getEmGenProveedors().remove(emGenProveedor);
		emGenProveedor.setEmGenEmpresaSede(null);

		return emGenProveedor;
	}

	public List<EmGenProveedorTelefono> getEmGenProveedorTelefonos() {
		return this.emGenProveedorTelefonos;
	}

	public void setEmGenProveedorTelefonos(List<EmGenProveedorTelefono> emGenProveedorTelefonos) {
		this.emGenProveedorTelefonos = emGenProveedorTelefonos;
	}

	public EmGenProveedorTelefono addEmGenProveedorTelefono(EmGenProveedorTelefono emGenProveedorTelefono) {
		getEmGenProveedorTelefonos().add(emGenProveedorTelefono);
		emGenProveedorTelefono.setEmGenEmpresaSede(this);

		return emGenProveedorTelefono;
	}

	public EmGenProveedorTelefono removeEmGenProveedorTelefono(EmGenProveedorTelefono emGenProveedorTelefono) {
		getEmGenProveedorTelefonos().remove(emGenProveedorTelefono);
		emGenProveedorTelefono.setEmGenEmpresaSede(null);

		return emGenProveedorTelefono;
	}

	public List<EmGenUnidadMedida> getEmGenUnidadMedidas() {
		return this.emGenUnidadMedidas;
	}

	public void setEmGenUnidadMedidas(List<EmGenUnidadMedida> emGenUnidadMedidas) {
		this.emGenUnidadMedidas = emGenUnidadMedidas;
	}

	public EmGenUnidadMedida addEmGenUnidadMedida(EmGenUnidadMedida emGenUnidadMedida) {
		getEmGenUnidadMedidas().add(emGenUnidadMedida);
		emGenUnidadMedida.setEmGenEmpresaSede(this);

		return emGenUnidadMedida;
	}

	public EmGenUnidadMedida removeEmGenUnidadMedida(EmGenUnidadMedida emGenUnidadMedida) {
		getEmGenUnidadMedidas().remove(emGenUnidadMedida);
		emGenUnidadMedida.setEmGenEmpresaSede(null);

		return emGenUnidadMedida;
	}

	public List<EmPersContrasena> getEmPersContrasenas() {
		return this.emPersContrasenas;
	}

	public void setEmPersContrasenas(List<EmPersContrasena> emPersContrasenas) {
		this.emPersContrasenas = emPersContrasenas;
	}

	public EmPersContrasena addEmPersContrasena(EmPersContrasena emPersContrasena) {
		getEmPersContrasenas().add(emPersContrasena);
		emPersContrasena.setEmGenEmpresaSede(this);

		return emPersContrasena;
	}

	public EmPersContrasena removeEmPersContrasena(EmPersContrasena emPersContrasena) {
		getEmPersContrasenas().remove(emPersContrasena);
		emPersContrasena.setEmGenEmpresaSede(null);

		return emPersContrasena;
	}

	public List<EmPersCorreo> getEmPersCorreos() {
		return this.emPersCorreos;
	}

	public void setEmPersCorreos(List<EmPersCorreo> emPersCorreos) {
		this.emPersCorreos = emPersCorreos;
	}

	public EmPersCorreo addEmPersCorreo(EmPersCorreo emPersCorreo) {
		getEmPersCorreos().add(emPersCorreo);
		emPersCorreo.setEmGenEmpresaSede(this);

		return emPersCorreo;
	}

	public EmPersCorreo removeEmPersCorreo(EmPersCorreo emPersCorreo) {
		getEmPersCorreos().remove(emPersCorreo);
		emPersCorreo.setEmGenEmpresaSede(null);

		return emPersCorreo;
	}

	public List<EmPersDireccion> getEmPersDireccions() {
		return this.emPersDireccions;
	}

	public void setEmPersDireccions(List<EmPersDireccion> emPersDireccions) {
		this.emPersDireccions = emPersDireccions;
	}

	public EmPersDireccion addEmPersDireccion(EmPersDireccion emPersDireccion) {
		getEmPersDireccions().add(emPersDireccion);
		emPersDireccion.setEmGenEmpresaSede(this);

		return emPersDireccion;
	}

	public EmPersDireccion removeEmPersDireccion(EmPersDireccion emPersDireccion) {
		getEmPersDireccions().remove(emPersDireccion);
		emPersDireccion.setEmGenEmpresaSede(null);

		return emPersDireccion;
	}

	public List<EmPersEmpleado> getEmPersEmpleados() {
		return this.emPersEmpleados;
	}

	public void setEmPersEmpleados(List<EmPersEmpleado> emPersEmpleados) {
		this.emPersEmpleados = emPersEmpleados;
	}

	public EmPersEmpleado addEmPersEmpleado(EmPersEmpleado emPersEmpleado) {
		getEmPersEmpleados().add(emPersEmpleado);
		emPersEmpleado.setEmGenEmpresaSede(this);

		return emPersEmpleado;
	}

	public EmPersEmpleado removeEmPersEmpleado(EmPersEmpleado emPersEmpleado) {
		getEmPersEmpleados().remove(emPersEmpleado);
		emPersEmpleado.setEmGenEmpresaSede(null);

		return emPersEmpleado;
	}

	public List<EmPersPersona> getEmPersPersonas() {
		return this.emPersPersonas;
	}

	public void setEmPersPersonas(List<EmPersPersona> emPersPersonas) {
		this.emPersPersonas = emPersPersonas;
	}

	public EmPersPersona addEmPersPersona(EmPersPersona emPersPersona) {
		getEmPersPersonas().add(emPersPersona);
		emPersPersona.setEmGenEmpresaSede(this);

		return emPersPersona;
	}

	public EmPersPersona removeEmPersPersona(EmPersPersona emPersPersona) {
		getEmPersPersonas().remove(emPersPersona);
		emPersPersona.setEmGenEmpresaSede(null);

		return emPersPersona;
	}

	public List<EmPersRole> getEmPersRoles() {
		return this.emPersRoles;
	}

	public void setEmPersRoles(List<EmPersRole> emPersRoles) {
		this.emPersRoles = emPersRoles;
	}

	public EmPersRole addEmPersRole(EmPersRole emPersRole) {
		getEmPersRoles().add(emPersRole);
		emPersRole.setEmGenEmpresaSede(this);

		return emPersRole;
	}

	public EmPersRole removeEmPersRole(EmPersRole emPersRole) {
		getEmPersRoles().remove(emPersRole);
		emPersRole.setEmGenEmpresaSede(null);

		return emPersRole;
	}

	public List<EmPersTelefono> getEmPersTelefonos() {
		return this.emPersTelefonos;
	}

	public void setEmPersTelefonos(List<EmPersTelefono> emPersTelefonos) {
		this.emPersTelefonos = emPersTelefonos;
	}

	public EmPersTelefono addEmPersTelefono(EmPersTelefono emPersTelefono) {
		getEmPersTelefonos().add(emPersTelefono);
		emPersTelefono.setEmGenEmpresaSede(this);

		return emPersTelefono;
	}

	public EmPersTelefono removeEmPersTelefono(EmPersTelefono emPersTelefono) {
		getEmPersTelefonos().remove(emPersTelefono);
		emPersTelefono.setEmGenEmpresaSede(null);

		return emPersTelefono;
	}

	public List<EmPersTipoDocumento> getEmPersTipoDocumentos() {
		return this.emPersTipoDocumentos;
	}

	public void setEmPersTipoDocumentos(List<EmPersTipoDocumento> emPersTipoDocumentos) {
		this.emPersTipoDocumentos = emPersTipoDocumentos;
	}

	public EmPersTipoDocumento addEmPersTipoDocumento(EmPersTipoDocumento emPersTipoDocumento) {
		getEmPersTipoDocumentos().add(emPersTipoDocumento);
		emPersTipoDocumento.setEmGenEmpresaSede(this);

		return emPersTipoDocumento;
	}

	public EmPersTipoDocumento removeEmPersTipoDocumento(EmPersTipoDocumento emPersTipoDocumento) {
		getEmPersTipoDocumentos().remove(emPersTipoDocumento);
		emPersTipoDocumento.setEmGenEmpresaSede(null);

		return emPersTipoDocumento;
	}

	public List<EmPersTipoPersona> getEmPersTipoPersonas() {
		return this.emPersTipoPersonas;
	}

	public void setEmPersTipoPersonas(List<EmPersTipoPersona> emPersTipoPersonas) {
		this.emPersTipoPersonas = emPersTipoPersonas;
	}

	public EmPersTipoPersona addEmPersTipoPersona(EmPersTipoPersona emPersTipoPersona) {
		getEmPersTipoPersonas().add(emPersTipoPersona);
		emPersTipoPersona.setEmGenEmpresaSede(this);

		return emPersTipoPersona;
	}

	public EmPersTipoPersona removeEmPersTipoPersona(EmPersTipoPersona emPersTipoPersona) {
		getEmPersTipoPersonas().remove(emPersTipoPersona);
		emPersTipoPersona.setEmGenEmpresaSede(null);

		return emPersTipoPersona;
	}

	public List<EmPersTipoTelefono> getEmPersTipoTelefonos() {
		return this.emPersTipoTelefonos;
	}

	public void setEmPersTipoTelefonos(List<EmPersTipoTelefono> emPersTipoTelefonos) {
		this.emPersTipoTelefonos = emPersTipoTelefonos;
	}

	public EmPersTipoTelefono addEmPersTipoTelefono(EmPersTipoTelefono emPersTipoTelefono) {
		getEmPersTipoTelefonos().add(emPersTipoTelefono);
		emPersTipoTelefono.setEmGenEmpresaSede(this);

		return emPersTipoTelefono;
	}

	public EmPersTipoTelefono removeEmPersTipoTelefono(EmPersTipoTelefono emPersTipoTelefono) {
		getEmPersTipoTelefonos().remove(emPersTipoTelefono);
		emPersTipoTelefono.setEmGenEmpresaSede(null);

		return emPersTipoTelefono;
	}

}